/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class OBJGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GeometryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.Geometry");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cVertexSourcesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cVertexSourcesVertexSourceParserRuleCall_0_0 = (RuleCall)cVertexSourcesAssignment_0.eContents().get(0);
		private final Assignment cNodesAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cNodesPolyShapeParserRuleCall_1_0 = (RuleCall)cNodesAssignment_1.eContents().get(0);
		
		//Geometry:
		//	(vertexSources+=VertexSource | nodes+=PolyShape)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(vertexSources+=VertexSource | nodes+=PolyShape)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//vertexSources+=VertexSource
		public Assignment getVertexSourcesAssignment_0() { return cVertexSourcesAssignment_0; }
		
		//VertexSource
		public RuleCall getVertexSourcesVertexSourceParserRuleCall_0_0() { return cVertexSourcesVertexSourceParserRuleCall_0_0; }
		
		//nodes+=PolyShape
		public Assignment getNodesAssignment_1() { return cNodesAssignment_1; }
		
		//PolyShape
		public RuleCall getNodesPolyShapeParserRuleCall_1_0() { return cNodesPolyShapeParserRuleCall_1_0; }
	}
	public class VertexSourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.VertexSource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVertexSourceAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cMtllibKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMaterialFilesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMaterialFilesEStringParserRuleCall_1_1_0 = (RuleCall)cMaterialFilesAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cGKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cEStringParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cVKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cVerticesAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cVerticesVertexParserRuleCall_3_0_1_0 = (RuleCall)cVerticesAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cVtKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cTextureCoordinatesAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cTextureCoordinatesTextureVertexParserRuleCall_3_1_1_0 = (RuleCall)cTextureCoordinatesAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cAlternatives_3.eContents().get(2);
		private final Keyword cVnKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final RuleCall cDOUBLETerminalRuleCall_3_2_1 = (RuleCall)cGroup_3_2.eContents().get(1);
		private final RuleCall cDOUBLETerminalRuleCall_3_2_2 = (RuleCall)cGroup_3_2.eContents().get(2);
		private final RuleCall cDOUBLETerminalRuleCall_3_2_3 = (RuleCall)cGroup_3_2.eContents().get(3);
		
		//VertexSource:
		//	{VertexSource} ('mtllib' materialFiles+=EString)* ('g' EString?)? ('v' vertices+=Vertex | 'vt'
		//	textureCoordinates+=TextureVertex | 'vn' DOUBLE DOUBLE DOUBLE)+;
		@Override public ParserRule getRule() { return rule; }
		
		//{VertexSource} ('mtllib' materialFiles+=EString)* ('g' EString?)? ('v' vertices+=Vertex | 'vt'
		//textureCoordinates+=TextureVertex | 'vn' DOUBLE DOUBLE DOUBLE)+
		public Group getGroup() { return cGroup; }
		
		//{VertexSource}
		public Action getVertexSourceAction_0() { return cVertexSourceAction_0; }
		
		//('mtllib' materialFiles+=EString)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'mtllib'
		public Keyword getMtllibKeyword_1_0() { return cMtllibKeyword_1_0; }
		
		//materialFiles+=EString
		public Assignment getMaterialFilesAssignment_1_1() { return cMaterialFilesAssignment_1_1; }
		
		//EString
		public RuleCall getMaterialFilesEStringParserRuleCall_1_1_0() { return cMaterialFilesEStringParserRuleCall_1_1_0; }
		
		//('g' EString?)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'g'
		public Keyword getGKeyword_2_0() { return cGKeyword_2_0; }
		
		//EString?
		public RuleCall getEStringParserRuleCall_2_1() { return cEStringParserRuleCall_2_1; }
		
		//('v' vertices+=Vertex | 'vt' textureCoordinates+=TextureVertex | 'vn' DOUBLE DOUBLE DOUBLE)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'v' vertices+=Vertex
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'v'
		public Keyword getVKeyword_3_0_0() { return cVKeyword_3_0_0; }
		
		//vertices+=Vertex
		public Assignment getVerticesAssignment_3_0_1() { return cVerticesAssignment_3_0_1; }
		
		//Vertex
		public RuleCall getVerticesVertexParserRuleCall_3_0_1_0() { return cVerticesVertexParserRuleCall_3_0_1_0; }
		
		//'vt' textureCoordinates+=TextureVertex
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'vt'
		public Keyword getVtKeyword_3_1_0() { return cVtKeyword_3_1_0; }
		
		//textureCoordinates+=TextureVertex
		public Assignment getTextureCoordinatesAssignment_3_1_1() { return cTextureCoordinatesAssignment_3_1_1; }
		
		//TextureVertex
		public RuleCall getTextureCoordinatesTextureVertexParserRuleCall_3_1_1_0() { return cTextureCoordinatesTextureVertexParserRuleCall_3_1_1_0; }
		
		//'vn' DOUBLE DOUBLE DOUBLE
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'vn'
		public Keyword getVnKeyword_3_2_0() { return cVnKeyword_3_2_0; }
		
		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall_3_2_1() { return cDOUBLETerminalRuleCall_3_2_1; }
		
		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall_3_2_2() { return cDOUBLETerminalRuleCall_3_2_2; }
		
		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall_3_2_3() { return cDOUBLETerminalRuleCall_3_2_3; }
	}
	public class PolyShapeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.PolyShape");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPolyShapeAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cMtllibKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMaterialFilesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMaterialFilesEStringParserRuleCall_1_1_0 = (RuleCall)cMaterialFilesAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cGKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_2_1_0 = (RuleCall)cNameAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cUsemtlKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cMaterialAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cMaterialMaterialParserRuleCall_3_1_0 = (RuleCall)cMaterialAssignment_3_1.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Keyword cFKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Assignment cFacesAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final RuleCall cFacesFaceParserRuleCall_4_0_1_0 = (RuleCall)cFacesAssignment_4_0_1.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Keyword cSKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Alternatives cAlternatives_4_1_1 = (Alternatives)cGroup_4_1.eContents().get(1);
		private final RuleCall cEIntParserRuleCall_4_1_1_0 = (RuleCall)cAlternatives_4_1_1.eContents().get(0);
		private final Keyword cOffKeyword_4_1_1_1 = (Keyword)cAlternatives_4_1_1.eContents().get(1);
		
		//PolyShape:
		//	{PolyShape} ('mtllib' materialFiles+=EString)* ('g' name=EString?)? ('usemtl' material=Material)? ('f' faces+=Face |
		//	's' (EInt | 'off'))+;
		@Override public ParserRule getRule() { return rule; }
		
		//{PolyShape} ('mtllib' materialFiles+=EString)* ('g' name=EString?)? ('usemtl' material=Material)? ('f' faces+=Face | 's'
		//(EInt | 'off'))+
		public Group getGroup() { return cGroup; }
		
		//{PolyShape}
		public Action getPolyShapeAction_0() { return cPolyShapeAction_0; }
		
		//('mtllib' materialFiles+=EString)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'mtllib'
		public Keyword getMtllibKeyword_1_0() { return cMtllibKeyword_1_0; }
		
		//materialFiles+=EString
		public Assignment getMaterialFilesAssignment_1_1() { return cMaterialFilesAssignment_1_1; }
		
		//EString
		public RuleCall getMaterialFilesEStringParserRuleCall_1_1_0() { return cMaterialFilesEStringParserRuleCall_1_1_0; }
		
		//('g' name=EString?)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'g'
		public Keyword getGKeyword_2_0() { return cGKeyword_2_0; }
		
		//name=EString?
		public Assignment getNameAssignment_2_1() { return cNameAssignment_2_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_1_0() { return cNameEStringParserRuleCall_2_1_0; }
		
		//('usemtl' material=Material)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'usemtl'
		public Keyword getUsemtlKeyword_3_0() { return cUsemtlKeyword_3_0; }
		
		//material=Material
		public Assignment getMaterialAssignment_3_1() { return cMaterialAssignment_3_1; }
		
		//Material
		public RuleCall getMaterialMaterialParserRuleCall_3_1_0() { return cMaterialMaterialParserRuleCall_3_1_0; }
		
		//('f' faces+=Face | 's' (EInt | 'off'))+
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//'f' faces+=Face
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//'f'
		public Keyword getFKeyword_4_0_0() { return cFKeyword_4_0_0; }
		
		//faces+=Face
		public Assignment getFacesAssignment_4_0_1() { return cFacesAssignment_4_0_1; }
		
		//Face
		public RuleCall getFacesFaceParserRuleCall_4_0_1_0() { return cFacesFaceParserRuleCall_4_0_1_0; }
		
		//'s' (EInt | 'off')
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//'s'
		public Keyword getSKeyword_4_1_0() { return cSKeyword_4_1_0; }
		
		//(EInt | 'off')
		public Alternatives getAlternatives_4_1_1() { return cAlternatives_4_1_1; }
		
		//EInt
		public RuleCall getEIntParserRuleCall_4_1_1_0() { return cEIntParserRuleCall_4_1_1_0; }
		
		//'off'
		public Keyword getOffKeyword_4_1_1_1() { return cOffKeyword_4_1_1_1; }
	}
	public class FaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.Face");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFaceAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cVertexIndicesAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cVertexIndicesEIntParserRuleCall_1_0_0 = (RuleCall)cVertexIndicesAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cSolidusKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1_1 = (Alternatives)cGroup_1_1.eContents().get(1);
		private final Assignment cTextureIndicesAssignment_1_1_1_0 = (Assignment)cAlternatives_1_1_1.eContents().get(0);
		private final RuleCall cTextureIndicesEIntParserRuleCall_1_1_1_0_0 = (RuleCall)cTextureIndicesAssignment_1_1_1_0.eContents().get(0);
		private final Group cGroup_1_1_1_1 = (Group)cAlternatives_1_1_1.eContents().get(1);
		private final Assignment cTextureIndicesAssignment_1_1_1_1_0 = (Assignment)cGroup_1_1_1_1.eContents().get(0);
		private final RuleCall cTextureIndicesEIntParserRuleCall_1_1_1_1_0_0 = (RuleCall)cTextureIndicesAssignment_1_1_1_1_0.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1_1_1_1 = (Keyword)cGroup_1_1_1_1.eContents().get(1);
		private final RuleCall cEIntParserRuleCall_1_1_1_1_2 = (RuleCall)cGroup_1_1_1_1.eContents().get(2);
		private final Group cGroup_1_1_1_2 = (Group)cAlternatives_1_1_1.eContents().get(2);
		private final Keyword cSolidusKeyword_1_1_1_2_0 = (Keyword)cGroup_1_1_1_2.eContents().get(0);
		private final RuleCall cEIntParserRuleCall_1_1_1_2_1 = (RuleCall)cGroup_1_1_1_2.eContents().get(1);
		
		//Face:
		//	{Face} (vertexIndices+=EInt ('/' (textureIndices+=EInt | textureIndices+=EInt '/' EInt | '/' EInt))?)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Face} (vertexIndices+=EInt ('/' (textureIndices+=EInt | textureIndices+=EInt '/' EInt | '/' EInt))?)*
		public Group getGroup() { return cGroup; }
		
		//{Face}
		public Action getFaceAction_0() { return cFaceAction_0; }
		
		//(vertexIndices+=EInt ('/' (textureIndices+=EInt | textureIndices+=EInt '/' EInt | '/' EInt))?)*
		public Group getGroup_1() { return cGroup_1; }
		
		//vertexIndices+=EInt
		public Assignment getVertexIndicesAssignment_1_0() { return cVertexIndicesAssignment_1_0; }
		
		//EInt
		public RuleCall getVertexIndicesEIntParserRuleCall_1_0_0() { return cVertexIndicesEIntParserRuleCall_1_0_0; }
		
		//('/' (textureIndices+=EInt | textureIndices+=EInt '/' EInt | '/' EInt))?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'/'
		public Keyword getSolidusKeyword_1_1_0() { return cSolidusKeyword_1_1_0; }
		
		//(textureIndices+=EInt | textureIndices+=EInt '/' EInt | '/' EInt)
		public Alternatives getAlternatives_1_1_1() { return cAlternatives_1_1_1; }
		
		//textureIndices+=EInt
		public Assignment getTextureIndicesAssignment_1_1_1_0() { return cTextureIndicesAssignment_1_1_1_0; }
		
		//EInt
		public RuleCall getTextureIndicesEIntParserRuleCall_1_1_1_0_0() { return cTextureIndicesEIntParserRuleCall_1_1_1_0_0; }
		
		//textureIndices+=EInt '/' EInt
		public Group getGroup_1_1_1_1() { return cGroup_1_1_1_1; }
		
		//textureIndices+=EInt
		public Assignment getTextureIndicesAssignment_1_1_1_1_0() { return cTextureIndicesAssignment_1_1_1_1_0; }
		
		//EInt
		public RuleCall getTextureIndicesEIntParserRuleCall_1_1_1_1_0_0() { return cTextureIndicesEIntParserRuleCall_1_1_1_1_0_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_1_1_1_1() { return cSolidusKeyword_1_1_1_1_1; }
		
		//EInt
		public RuleCall getEIntParserRuleCall_1_1_1_1_2() { return cEIntParserRuleCall_1_1_1_1_2; }
		
		//'/' EInt
		public Group getGroup_1_1_1_2() { return cGroup_1_1_1_2; }
		
		//'/'
		public Keyword getSolidusKeyword_1_1_1_2_0() { return cSolidusKeyword_1_1_1_2_0; }
		
		//EInt
		public RuleCall getEIntParserRuleCall_1_1_1_2_1() { return cEIntParserRuleCall_1_1_1_2_1; }
	}
	public class VertexElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.Vertex");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVertexAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXEDoubleParserRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		private final Assignment cYAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cYEDoubleParserRuleCall_2_0 = (RuleCall)cYAssignment_2.eContents().get(0);
		private final Assignment cZAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cZEDoubleParserRuleCall_3_0 = (RuleCall)cZAssignment_3.eContents().get(0);
		
		//Vertex:
		//	{Vertex} x=EDouble y=EDouble z=EDouble;
		@Override public ParserRule getRule() { return rule; }
		
		//{Vertex} x=EDouble y=EDouble z=EDouble
		public Group getGroup() { return cGroup; }
		
		//{Vertex}
		public Action getVertexAction_0() { return cVertexAction_0; }
		
		//x=EDouble
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//EDouble
		public RuleCall getXEDoubleParserRuleCall_1_0() { return cXEDoubleParserRuleCall_1_0; }
		
		//y=EDouble
		public Assignment getYAssignment_2() { return cYAssignment_2; }
		
		//EDouble
		public RuleCall getYEDoubleParserRuleCall_2_0() { return cYEDoubleParserRuleCall_2_0; }
		
		//z=EDouble
		public Assignment getZAssignment_3() { return cZAssignment_3; }
		
		//EDouble
		public RuleCall getZEDoubleParserRuleCall_3_0() { return cZEDoubleParserRuleCall_3_0; }
	}
	public class TextureVertexElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.TextureVertex");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cXAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cXEDoubleParserRuleCall_0_0 = (RuleCall)cXAssignment_0.eContents().get(0);
		private final Assignment cYAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cYEDoubleParserRuleCall_1_0 = (RuleCall)cYAssignment_1.eContents().get(0);
		private final Assignment cZAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cZEDoubleParserRuleCall_2_0 = (RuleCall)cZAssignment_2.eContents().get(0);
		
		//TextureVertex Vertex:
		//	x=EDouble y=EDouble z=EDouble?
		@Override public ParserRule getRule() { return rule; }
		
		//x=EDouble y=EDouble z=EDouble?
		public Group getGroup() { return cGroup; }
		
		//x=EDouble
		public Assignment getXAssignment_0() { return cXAssignment_0; }
		
		//EDouble
		public RuleCall getXEDoubleParserRuleCall_0_0() { return cXEDoubleParserRuleCall_0_0; }
		
		//y=EDouble
		public Assignment getYAssignment_1() { return cYAssignment_1; }
		
		//EDouble
		public RuleCall getYEDoubleParserRuleCall_1_0() { return cYEDoubleParserRuleCall_1_0; }
		
		//z=EDouble?
		public Assignment getZAssignment_2() { return cZAssignment_2; }
		
		//EDouble
		public RuleCall getZEDoubleParserRuleCall_2_0() { return cZEDoubleParserRuleCall_2_0; }
	}
	public class MaterialElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.Material");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMaterialAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cPhongMatNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPhongMatNameEStringParserRuleCall_1_0 = (RuleCall)cPhongMatNameAssignment_1.eContents().get(0);
		
		//Material:
		//	{Material} phongMatName=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Material} phongMatName=EString
		public Group getGroup() { return cGroup; }
		
		//{Material}
		public Action getMaterialAction_0() { return cMaterialAction_0; }
		
		//phongMatName=EString
		public Assignment getPhongMatNameAssignment_1() { return cPhongMatNameAssignment_1; }
		
		//EString
		public RuleCall getPhongMatNameEStringParserRuleCall_1_0() { return cPhongMatNameEStringParserRuleCall_1_0; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Keyword cFullStopKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cSolidusKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cReverseSolidusKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword c_Keyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cHyphenMinusKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		
		//EString:
		//	(STRING | ID | INT | '.' | '/' | '\\' | ':' | '_' | '-')+;
		@Override public ParserRule getRule() { return rule; }
		
		//(STRING | ID | INT | '.' | '/' | '\\' | ':' | '_' | '-')+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
		
		//'/'
		public Keyword getSolidusKeyword_4() { return cSolidusKeyword_4; }
		
		//'\\'
		public Keyword getReverseSolidusKeyword_5() { return cReverseSolidusKeyword_5; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//'_'
		public Keyword get_Keyword_7() { return c_Keyword_7; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_8() { return cHyphenMinusKeyword_8; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.EDouble");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDOUBLETerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEIntParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EDouble ecore::EDouble:
		//	DOUBLE | EInt
		@Override public ParserRule getRule() { return rule; }
		
		//DOUBLE | EInt
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall_0() { return cDOUBLETerminalRuleCall_0; }
		
		//EInt
		public RuleCall getEIntParserRuleCall_1() { return cEIntParserRuleCall_1; }
	}
	
	
	private final GeometryElements pGeometry;
	private final VertexSourceElements pVertexSource;
	private final PolyShapeElements pPolyShape;
	private final FaceElements pFace;
	private final VertexElements pVertex;
	private final TextureVertexElements pTextureVertex;
	private final MaterialElements pMaterial;
	private final EIntElements pEInt;
	private final EStringElements pEString;
	private final EDoubleElements pEDouble;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tDOUBLE;
	private final TerminalRule tWS;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public OBJGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGeometry = new GeometryElements();
		this.pVertexSource = new VertexSourceElements();
		this.pPolyShape = new PolyShapeElements();
		this.pFace = new FaceElements();
		this.pVertex = new VertexElements();
		this.pTextureVertex = new TextureVertexElements();
		this.pMaterial = new MaterialElements();
		this.pEInt = new EIntElements();
		this.pEString = new EStringElements();
		this.pEDouble = new EDoubleElements();
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.SL_COMMENT");
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.DOUBLE");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.january.geometry.xtext.OBJ.WS");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.january.geometry.xtext.OBJ".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Geometry:
	//	(vertexSources+=VertexSource | nodes+=PolyShape)*;
	public GeometryElements getGeometryAccess() {
		return pGeometry;
	}
	
	public ParserRule getGeometryRule() {
		return getGeometryAccess().getRule();
	}
	
	//VertexSource:
	//	{VertexSource} ('mtllib' materialFiles+=EString)* ('g' EString?)? ('v' vertices+=Vertex | 'vt'
	//	textureCoordinates+=TextureVertex | 'vn' DOUBLE DOUBLE DOUBLE)+;
	public VertexSourceElements getVertexSourceAccess() {
		return pVertexSource;
	}
	
	public ParserRule getVertexSourceRule() {
		return getVertexSourceAccess().getRule();
	}
	
	//PolyShape:
	//	{PolyShape} ('mtllib' materialFiles+=EString)* ('g' name=EString?)? ('usemtl' material=Material)? ('f' faces+=Face |
	//	's' (EInt | 'off'))+;
	public PolyShapeElements getPolyShapeAccess() {
		return pPolyShape;
	}
	
	public ParserRule getPolyShapeRule() {
		return getPolyShapeAccess().getRule();
	}
	
	//Face:
	//	{Face} (vertexIndices+=EInt ('/' (textureIndices+=EInt | textureIndices+=EInt '/' EInt | '/' EInt))?)*;
	public FaceElements getFaceAccess() {
		return pFace;
	}
	
	public ParserRule getFaceRule() {
		return getFaceAccess().getRule();
	}
	
	//Vertex:
	//	{Vertex} x=EDouble y=EDouble z=EDouble;
	public VertexElements getVertexAccess() {
		return pVertex;
	}
	
	public ParserRule getVertexRule() {
		return getVertexAccess().getRule();
	}
	
	//TextureVertex Vertex:
	//	x=EDouble y=EDouble z=EDouble?
	public TextureVertexElements getTextureVertexAccess() {
		return pTextureVertex;
	}
	
	public ParserRule getTextureVertexRule() {
		return getTextureVertexAccess().getRule();
	}
	
	//Material:
	//	{Material} phongMatName=EString;
	public MaterialElements getMaterialAccess() {
		return pMaterial;
	}
	
	public ParserRule getMaterialRule() {
		return getMaterialAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EString:
	//	(STRING | ID | INT | '.' | '/' | '\\' | ':' | '_' | '-')+;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	DOUBLE | EInt
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//terminal SL_COMMENT:
	//	'#' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal DOUBLE returns ecore::EDouble:
	//	('-' | '+')? INT? '.' INT (('E' | 'e') ('-' | '+')? INT)?;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
