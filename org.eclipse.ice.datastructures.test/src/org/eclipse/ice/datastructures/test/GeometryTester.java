/*******************************************************************************
 * Copyright (c) 2012, 2014 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Initial API and implementation and/or initial documentation - Jay Jay Billings,
 *   Jordan H. Deyton, Dasha Gorin, Alexander J. McCaskey, Taylor Patterson,
 *   Claire Saunders, Matthew Wang, Anna Wojtowicz
 *******************************************************************************/
package org.eclipse.ice.datastructures.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import org.eclipse.ice.datastructures.ICEObject.ICEJAXBHandler;
import org.eclipse.ice.datastructures.form.GeometryComponent;
import org.eclipse.ice.viz.service.geometry.shapes.OperatorType;
import org.eclipse.ice.viz.service.geometry.shapes.ShapeType;
import org.eclipse.ice.viz.service.modeling.AbstractView;
import org.eclipse.ice.viz.service.modeling.Shape;
import org.eclipse.ice.viz.service.modeling.ShapeComponent;
import org.eclipse.ice.viz.service.modeling.Transformation;
import org.junit.Test;

/**
 * <p>
 * Checks the overall functionality of the geometry package and the interaction
 * between each of its components
 * </p>
 * 
 * @author Jay Jay Billings
 */
public class GeometryTester {
	/**
	 * <p>
	 * Checks the functionality of exporting an entire CSG tree to XML
	 * </p>
	 * 
	 * @throws IOException
	 * @throws JAXBException
	 * @throws NullPointerException
	 * 
	 */
	@Test
	public void checkCSGTree()
			throws NullPointerException, JAXBException, IOException {

		// Create a shape
		ShapeComponent geometryModel = new ShapeComponent();
		AbstractView geometryView = new AbstractView();
		Shape geometryShape = new Shape(geometryModel, geometryView);

		// Create the root GeometryComponent
		GeometryComponent geometry = new GeometryComponent();
		geometry.setGeometry(geometryShape);
		geometry.setName("Root geometry");
		geometry.setDescription("This here's a verr' fine geom'try structcha");
		ICEJAXBHandler xmlHandler = new ICEJAXBHandler();
		ArrayList<Class> classList = new ArrayList<Class>();
		classList.add(GeometryComponent.class);

		// Create the CSG elements
		Shape union = (Shape) geometryShape.clone();
		union.setProperty("Operator", OperatorType.Union.toString());
		Shape intersection = (Shape) geometryShape.clone();
		union.setProperty("Operator", OperatorType.Intersection.toString());

		Shape complement = (Shape) geometryShape.clone();
		complement.setProperty("OperatorType",
				OperatorType.Complement.toString());
		complement.setProperty("Operator", OperatorType.Complement.toString());
		complement.setProperty("Description", "Official ICE shape");

		Shape sphere1 = (Shape) geometryShape.clone();
		sphere1.setProperty("Type", ShapeType.Sphere.toString());
		Shape sphere2 = (Shape) geometryShape.clone();
		sphere2.setProperty("Type", ShapeType.Sphere.toString());
		Shape cube = (Shape) geometryShape.clone();
		cube.setProperty("Type", ShapeType.Cube.toString());
		Shape cone = (Shape) geometryShape.clone();
		cone.setProperty("Type", ShapeType.Cone.toString());
		Shape cylinder = (Shape) geometryShape.clone();
		cylinder.setProperty("Type", ShapeType.Cylinder.toString());

		// Edit the transformations
		Transformation sphere1Transformation = sphere1.getTransformation();
		Transformation sphere2Transformation = new Transformation();
		Transformation intersectionTransformation = intersection
				.getTransformation();

		sphere1Transformation.setScale(0, 0, 2.0);
		sphere1Transformation.setScale(1, 1, 2.0);
		sphere1Transformation.setScale(2, 2, 2.0);

		sphere2Transformation.setScale(2, 2, -4.5);

		intersectionTransformation.setScale(3, 0, 2.0);
		intersectionTransformation.setScale(3, 2, -1.5);

		sphere1.setTransformation(sphere1Transformation);
		sphere2.setTransformation(sphere2Transformation);
		intersection.setTransformation(intersectionTransformation);

		// Add some properties
		intersection.setProperty("selected", "true");
		union.setProperty("awesome?", "yes");

		// Create the CSG tree
		geometry.getGeometry().addEntity(union);

		union.addEntity(complement);
		union.addEntity(cone);
		union.addEntity(cylinder);

		complement.addEntity(cube);
		complement.addEntity(intersection);

		intersection.addEntity(sphere1);
		intersection.addEntity(sphere2);

		// Persist GeometryComponent to XML
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		xmlHandler.write(geometry, classList, outputStream);

		// Print the XML output
		// System.out.println(outputStream.toString());

		ByteArrayInputStream inputStream = new ByteArrayInputStream(
				outputStream.toByteArray());

		// Load a new GeometryComponent from XML
		GeometryComponent loadedGeometry = new GeometryComponent();
		loadedGeometry = (GeometryComponent) xmlHandler.read(classList,
				inputStream);

		assertTrue(geometry.equals(loadedGeometry));

		// Change one of the IShapes to check whether the two geometries are
		// not equal
		sphere1.setTransformation(new Transformation());

		assertFalse(geometry.equals(loadedGeometry));
	}
}