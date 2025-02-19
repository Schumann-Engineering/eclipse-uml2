package org.eclipse.uml2.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class Class
{
  protected static String nl;
  public static synchronized Class create(String lineSeparator)
  {
    nl = lineSeparator;
    Class result = new Class();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " */";
  protected final String TEXT_5 = NL + "package ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_9 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_10 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_11 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_12 = NL + " *";
  protected final String TEXT_13 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_14 = NL + " *   <li>{@link ";
  protected final String TEXT_15 = "#";
  protected final String TEXT_16 = " <em>";
  protected final String TEXT_17 = "</em>}</li>";
  protected final String TEXT_18 = NL + " * </ul>";
  protected final String TEXT_19 = NL + " * @see ";
  protected final String TEXT_20 = "#get";
  protected final String TEXT_21 = "()";
  protected final String TEXT_22 = NL + " * @model ";
  protected final String TEXT_23 = NL + " *        ";
  protected final String TEXT_24 = NL + " * @model";
  protected final String TEXT_25 = NL + " * @extends ";
  protected final String TEXT_26 = NL + " * @generated" + NL + " */";
  protected final String TEXT_27 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_28 = NL + " * <p>" + NL + " * The following features are implemented:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_29 = NL + "@Deprecated";
  protected final String TEXT_30 = NL + "@SuppressWarnings(\"deprecation\")";
  protected final String TEXT_31 = NL + "public";
  protected final String TEXT_32 = " abstract";
  protected final String TEXT_33 = " class ";
  protected final String TEXT_34 = NL + "public interface ";
  protected final String TEXT_35 = NL + "{";
  protected final String TEXT_36 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_37 = " copyright = ";
  protected final String TEXT_38 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_39 = " mofDriverNumber = \"";
  protected final String TEXT_40 = "\";";
  protected final String TEXT_41 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_42 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_43 = NL + "\t@";
  protected final String TEXT_44 = NL + "\tprotected Object[] ";
  protected final String TEXT_45 = ";" + NL;
  protected final String TEXT_46 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_47 = NL + "\tprotected int ";
  protected final String TEXT_48 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_49 = " = 0;" + NL;
  protected final String TEXT_50 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_51 = "() <em>";
  protected final String TEXT_52 = "</em>}' array accessor." + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_53 = NL + "\t * ";
  protected final String TEXT_54 = NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_55 = NL + "\t@Deprecated";
  protected final String TEXT_56 = NL + "\t@SuppressWarnings(\"rawtypes\")";
  protected final String TEXT_57 = NL + "\tprotected static final ";
  protected final String TEXT_58 = "[] ";
  protected final String TEXT_59 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_60 = " [0]";
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_62 = "</em>}' ";
  protected final String TEXT_63 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_64 = NL + "\tprotected ";
  protected final String TEXT_65 = ".Internal.SettingDelegate ";
  protected final String TEXT_66 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_67 = ".Internal)";
  protected final String TEXT_68 = ").getSettingDelegate();" + NL;
  protected final String TEXT_69 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_70 = " ";
  protected final String TEXT_71 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_72 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_73 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_74 = "; // TODO The default value literal \"";
  protected final String TEXT_75 = "\" is not valid.";
  protected final String TEXT_76 = " = ";
  protected final String TEXT_77 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_78 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_79 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_80 = NL + "\tprotected static final int ";
  protected final String TEXT_81 = "_EFLAG_OFFSET = ";
  protected final String TEXT_82 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_83 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_84 = ".ordinal()";
  protected final String TEXT_85 = ".VALUES.indexOf(";
  protected final String TEXT_86 = ")";
  protected final String TEXT_87 = " << ";
  protected final String TEXT_88 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_89 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_90 = NL + "\tprivate static final ";
  protected final String TEXT_91 = "_EFLAG_VALUES = ";
  protected final String TEXT_92 = ".values()";
  protected final String TEXT_93 = "(";
  protected final String TEXT_94 = "[])";
  protected final String TEXT_95 = ".VALUES.toArray(new ";
  protected final String TEXT_96 = "[";
  protected final String TEXT_97 = ".VALUES.size()])";
  protected final String TEXT_98 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_99 = " representing the value of the '{@link #";
  protected final String TEXT_100 = "_EFLAG = ";
  protected final String TEXT_101 = "_EFLAG_OFFSET";
  protected final String TEXT_102 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_103 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_104 = "_ESETFLAG = 1 << ";
  protected final String TEXT_105 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_106 = NL + "\tprotected boolean ";
  protected final String TEXT_107 = "ESet;" + NL;
  protected final String TEXT_108 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_109 = ".getFeatureID(";
  protected final String TEXT_110 = ") - ";
  protected final String TEXT_111 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_112 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_113 = NL + "\tprivate static final int ";
  protected final String TEXT_114 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int EOPERATION_OFFSET_CORRECTION = ";
  protected final String TEXT_115 = ".getOperationID(";
  protected final String TEXT_116 = "public";
  protected final String TEXT_117 = "protected";
  protected final String TEXT_118 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_119 = NL + "\t\t";
  protected final String TEXT_120 = " |= ";
  protected final String TEXT_121 = "_EFLAG";
  protected final String TEXT_122 = "_DEFAULT";
  protected final String TEXT_123 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_124 = NL + "\t@Override";
  protected final String TEXT_125 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_126 = ";" + NL + "\t}" + NL;
  protected final String TEXT_127 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected static final int ESTATIC_FEATURE_COUNT = ";
  protected final String TEXT_128 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_129 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_130 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * @see #";
  protected final String TEXT_131 = NL + "\tpublic ";
  protected final String TEXT_132 = "()" + NL + "\t{";
  protected final String TEXT_133 = " list = (";
  protected final String TEXT_134 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_135 = "_EEMPTY_ARRAY;";
  protected final String TEXT_136 = NL + "\t\tif (";
  protected final String TEXT_137 = " == null || ";
  protected final String TEXT_138 = ".isEmpty()) return ";
  protected final String TEXT_139 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_140 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_141 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_142 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context.";
  protected final String TEXT_143 = NL + "\t@Override";
  protected final String TEXT_144 = "_";
  protected final String TEXT_145 = " = (";
  protected final String TEXT_146 = ")eVirtualGet(";
  protected final String TEXT_147 = ");";
  protected final String TEXT_148 = " == null)" + NL + "\t\t{";
  protected final String TEXT_149 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_150 = ", ";
  protected final String TEXT_151 = " = new ";
  protected final String TEXT_152 = NL + "\t\t\t";
  protected final String TEXT_153 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_154 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific type known in this context.";
  protected final String TEXT_155 = " basicSet";
  protected final String TEXT_156 = " new";
  protected final String TEXT_157 = " msgs)" + NL + "\t{" + NL + "\t\treturn super.basicSet";
  protected final String TEXT_158 = "(new";
  protected final String TEXT_159 = ", msgs);" + NL + "\t}" + NL;
  protected final String TEXT_160 = NL + "\tpublic void set";
  protected final String TEXT_161 = ")" + NL + "\t{" + NL + "\t\tsuper.set";
  protected final String TEXT_162 = ");" + NL + "\t}" + NL;
  protected final String TEXT_163 = NL + "\t";
  protected final String TEXT_164 = "();" + NL;
  protected final String TEXT_165 = " get";
  protected final String TEXT_166 = "(int index);" + NL;
  protected final String TEXT_167 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_168 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_169 = NL + "\tint get";
  protected final String TEXT_170 = "Length();" + NL;
  protected final String TEXT_171 = NL + "\tpublic int get";
  protected final String TEXT_172 = "Length()" + NL + "\t{";
  protected final String TEXT_173 = NL + "\t\treturn ";
  protected final String TEXT_174 = "().size();";
  protected final String TEXT_175 = " == null ? 0 : ";
  protected final String TEXT_176 = ".size();";
  protected final String TEXT_177 = NL + "\t}" + NL;
  protected final String TEXT_178 = NL + "\tvoid set";
  protected final String TEXT_179 = "[] new";
  protected final String TEXT_180 = ");" + NL;
  protected final String TEXT_181 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_182 = "()).setData(new";
  protected final String TEXT_183 = ".length, new";
  protected final String TEXT_184 = "(int index, ";
  protected final String TEXT_185 = " element);" + NL;
  protected final String TEXT_186 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_187 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_188 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_189 = "</b></em>' ";
  protected final String TEXT_190 = ".";
  protected final String TEXT_191 = NL + "\t * The key is of type ";
  protected final String TEXT_192 = "list of {@link ";
  protected final String TEXT_193 = "}";
  protected final String TEXT_194 = "{@link ";
  protected final String TEXT_195 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_196 = ",";
  protected final String TEXT_197 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_198 = NL + "\t * The default value is <code>";
  protected final String TEXT_199 = "</code>.";
  protected final String TEXT_200 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_201 = "}.";
  protected final String TEXT_202 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_203 = "</em>}'.";
  protected final String TEXT_204 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * </p>" + NL + "\t * <ul>";
  protected final String TEXT_205 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_206 = "</em>}'</li>";
  protected final String TEXT_207 = NL + "\t * </ul>";
  protected final String TEXT_208 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * </p>" + NL + "\t * <ul>";
  protected final String TEXT_209 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_210 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_211 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_212 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_213 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_214 = "</em>' ";
  protected final String TEXT_215 = NL + "\t * @see ";
  protected final String TEXT_216 = NL + "\t * @see #isSet";
  protected final String TEXT_217 = NL + "\t * @see #unset";
  protected final String TEXT_218 = NL + "\t * @see #set";
  protected final String TEXT_219 = NL + "\t * @model ";
  protected final String TEXT_220 = NL + "\t *        ";
  protected final String TEXT_221 = NL + "\t * @model";
  protected final String TEXT_222 = ")eDynamicGet(";
  protected final String TEXT_223 = " - ESTATIC_FEATURE_COUNT";
  protected final String TEXT_224 = ", true, ";
  protected final String TEXT_225 = ").";
  protected final String TEXT_226 = ")eGet(";
  protected final String TEXT_227 = ", true)";
  protected final String TEXT_228 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_229 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_230 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_231 = "eContainer";
  protected final String TEXT_232 = "eInternalContainer";
  protected final String TEXT_233 = "();";
  protected final String TEXT_234 = " != null && ";
  protected final String TEXT_235 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_236 = " old";
  protected final String TEXT_237 = ";" + NL + "\t\t\t";
  protected final String TEXT_238 = "eResolveProxy(old";
  protected final String TEXT_239 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_240 = " != old";
  protected final String TEXT_241 = ")" + NL + "\t\t\t{";
  protected final String TEXT_242 = NL + "\t\t\t\t";
  protected final String TEXT_243 = " msgs = old";
  protected final String TEXT_244 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_245 = ", null, null);";
  protected final String TEXT_246 = " msgs =  old";
  protected final String TEXT_247 = ".eInverseRemove(this, ";
  protected final String TEXT_248 = ".class, null);";
  protected final String TEXT_249 = NL + "\t\t\t\tif (new";
  protected final String TEXT_250 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_251 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_252 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_253 = ", null, msgs);";
  protected final String TEXT_254 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_255 = ".eInverseAdd(this, ";
  protected final String TEXT_256 = ".class, msgs);";
  protected final String TEXT_257 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_258 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_259 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_260 = "(this, ";
  protected final String TEXT_261 = ".RESOLVE, ";
  protected final String TEXT_262 = ", old";
  protected final String TEXT_263 = "));";
  protected final String TEXT_264 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_265 = NL + "\t\treturn (";
  protected final String TEXT_266 = " & ";
  protected final String TEXT_267 = "_EFLAG) != 0;";
  protected final String TEXT_268 = "_EFLAG_VALUES[(";
  protected final String TEXT_269 = "_EFLAG) >>> ";
  protected final String TEXT_270 = "_EFLAG_OFFSET];";
  protected final String TEXT_271 = " = basicGet";
  protected final String TEXT_272 = "();" + NL + "\t\treturn ";
  protected final String TEXT_273 = ".eIsProxy() ? ";
  protected final String TEXT_274 = "eResolveProxy(";
  protected final String TEXT_275 = ") : ";
  protected final String TEXT_276 = NL + "\t\treturn new ";
  protected final String TEXT_277 = "((";
  protected final String TEXT_278 = ".Internal)((";
  protected final String TEXT_279 = ".Internal.Wrapper)get";
  protected final String TEXT_280 = "()).featureMap().";
  protected final String TEXT_281 = "list(";
  protected final String TEXT_282 = ")get";
  protected final String TEXT_283 = "().";
  protected final String TEXT_284 = NL + "\t\treturn ((";
  protected final String TEXT_285 = "()).featureMap().list(";
  protected final String TEXT_286 = NL + "\t\treturn get";
  protected final String TEXT_287 = "().list(";
  protected final String TEXT_288 = "()).featureMap().get(";
  protected final String TEXT_289 = "get";
  protected final String TEXT_290 = "().get(";
  protected final String TEXT_291 = NL + "\t\t";
  protected final String TEXT_292 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_293 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_294 = NL + "\t\t\t";
  protected final String TEXT_295 = " result = (";
  protected final String TEXT_296 = ") cache.get(";
  protected final String TEXT_297 = "eResource(), ";
  protected final String TEXT_298 = "this, ";
  protected final String TEXT_299 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_300 = ", result = ";
  protected final String TEXT_301 = "new ";
  protected final String TEXT_302 = "(this)";
  protected final String TEXT_303 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_304 = ";" + NL + "\t\t}";
  protected final String TEXT_305 = NL + "\t\treturn ";
  protected final String TEXT_306 = "(this);";
  protected final String TEXT_307 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_308 = " eResource = eResource();";
  protected final String TEXT_309 = ") cache.get(eResource, this, ";
  protected final String TEXT_310 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_311 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_312 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_313 = NL + "\t\treturn new ";
  protected final String TEXT_314 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_315 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_316 = " method = getClass().getMethod(\"";
  protected final String TEXT_317 = "\", null);";
  protected final String TEXT_318 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_319 = NL + "\t\t\t\t";
  protected final String TEXT_320 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_321 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_322 = " union = ";
  protected final String TEXT_323 = "Helper(new ";
  protected final String TEXT_324 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_325 = "null";
  protected final String TEXT_326 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_327 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_328 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_329 = ") cache.get(eResource(), this, ";
  protected final String TEXT_330 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_331 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_332 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_333 = NL + "\t\t}";
  protected final String TEXT_334 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_335 = ", union.size(), union.toArray());";
  protected final String TEXT_336 = NL + "\t\tif (isSet";
  protected final String TEXT_337 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_338 = "();" + NL + "\t\t}";
  protected final String TEXT_339 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_340 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_341 = "();" + NL + "\t\tif (";
  protected final String TEXT_342 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_343 = "super.";
  protected final String TEXT_344 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_345 = "' ";
  protected final String TEXT_346 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_347 = " basicGet";
  protected final String TEXT_348 = ", false, ";
  protected final String TEXT_349 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_350 = ")eInternalContainer();";
  protected final String TEXT_351 = ")((";
  protected final String TEXT_352 = ", false);";
  protected final String TEXT_353 = "basicGet";
  protected final String TEXT_354 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_355 = "super.basicGet";
  protected final String TEXT_356 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_357 = " msgs)" + NL + "\t{";
  protected final String TEXT_358 = NL + "\t\tif (new";
  protected final String TEXT_359 = " != null && !(new";
  protected final String TEXT_360 = " instanceof ";
  protected final String TEXT_361 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_362 = " must be an instance of ";
  protected final String TEXT_363 = "\");";
  protected final String TEXT_364 = NL + "\t\tmsgs = eBasicSetContainer(";
  protected final String TEXT_365 = ", msgs);";
  protected final String TEXT_366 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_367 = NL + "\t\t\tObject ";
  protected final String TEXT_368 = " = eVirtualGet(";
  protected final String TEXT_369 = NL + "\t\t\tif (";
  protected final String TEXT_370 = " != new";
  protected final String TEXT_371 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_372 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_373 = NL + "\t\t\tif (new";
  protected final String TEXT_374 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_375 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_376 = ".contains(new";
  protected final String TEXT_377 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_378 = ".add(new";
  protected final String TEXT_379 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_380 = NL + "\t\t\t\tObject ";
  protected final String TEXT_381 = NL + "\t\t\t\tif (new";
  protected final String TEXT_382 = " != ";
  protected final String TEXT_383 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_384 = NL + "\t\t\t}";
  protected final String TEXT_385 = NL + "\t\treturn msgs;";
  protected final String TEXT_386 = NL + "\t\tmsgs = eDynamicInverseAdd(";
  protected final String TEXT_387 = NL + "\t\tObject old";
  protected final String TEXT_388 = " = eVirtualSet(";
  protected final String TEXT_389 = ", new";
  protected final String TEXT_390 = ";" + NL + "\t\t";
  protected final String TEXT_391 = " = new";
  protected final String TEXT_392 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_393 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_394 = NL + "\t\tboolean old";
  protected final String TEXT_395 = "ESet = (";
  protected final String TEXT_396 = "_ESETFLAG) != 0;";
  protected final String TEXT_397 = "_ESETFLAG;";
  protected final String TEXT_398 = "ESet = ";
  protected final String TEXT_399 = "ESet;";
  protected final String TEXT_400 = "ESet = true;";
  protected final String TEXT_401 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_402 = " notification = new ";
  protected final String TEXT_403 = ".SET, ";
  protected final String TEXT_404 = "isSetChange ? null : old";
  protected final String TEXT_405 = "old";
  protected final String TEXT_406 = "isSetChange";
  protected final String TEXT_407 = "!old";
  protected final String TEXT_408 = "ESet";
  protected final String TEXT_409 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_410 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_411 = "()).featureMap()).basicAdd(";
  protected final String TEXT_412 = ".Internal)get";
  protected final String TEXT_413 = "()).basicAdd(";
  protected final String TEXT_414 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_415 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_416 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_417 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_418 = "new";
  protected final String TEXT_419 = "value";
  protected final String TEXT_420 = " the new value of the '<em>";
  protected final String TEXT_421 = NL + "\t * @see #";
  protected final String TEXT_422 = " value);" + NL;
  protected final String TEXT_423 = ")" + NL + "\t{";
  protected final String TEXT_424 = NL + "\t\tnew";
  protected final String TEXT_425 = " == null ? ";
  protected final String TEXT_426 = " : new";
  protected final String TEXT_427 = NL + "\t\teDynamicSet(";
  protected final String TEXT_428 = NL + "\t\teSet(";
  protected final String TEXT_429 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_430 = NL + "\t\tif (new";
  protected final String TEXT_431 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_432 = " && new";
  protected final String TEXT_433 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_434 = ".isAncestor(this, ";
  protected final String TEXT_435 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_436 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_437 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_438 = " != null)" + NL + "\t\t\t\tmsgs = ";
  protected final String TEXT_439 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_440 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_441 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_442 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_443 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_444 = " != null)";
  protected final String TEXT_445 = NL + "\t\t\t\tmsgs = ";
  protected final String TEXT_446 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_447 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_448 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_449 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_450 = NL + "\t\t\tboolean old";
  protected final String TEXT_451 = "ESet = eVirtualIsSet(";
  protected final String TEXT_452 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_453 = ", !old";
  protected final String TEXT_454 = "ESet));";
  protected final String TEXT_455 = NL + "\t\t}";
  protected final String TEXT_456 = ") ";
  protected final String TEXT_457 = "_EFLAG; else ";
  protected final String TEXT_458 = " &= ~";
  protected final String TEXT_459 = "_EFLAG;";
  protected final String TEXT_460 = " == null) new";
  protected final String TEXT_461 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_462 = " & ~";
  protected final String TEXT_463 = "_EFLAG | ";
  protected final String TEXT_464 = ".VALUES.indexOf(new";
  protected final String TEXT_465 = "_EFLAG_OFFSET;";
  protected final String TEXT_466 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_467 = "isSetChange ? ";
  protected final String TEXT_468 = " : old";
  protected final String TEXT_469 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_470 = NL + "\t\t((";
  protected final String TEXT_471 = "()).featureMap()).set(";
  protected final String TEXT_472 = "()).set(";
  protected final String TEXT_473 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_474 = " basicUnset";
  protected final String TEXT_475 = NL + "\t\treturn eDynamicInverseRemove(";
  protected final String TEXT_476 = "(), ";
  protected final String TEXT_477 = "Object old";
  protected final String TEXT_478 = "eVirtualUnset(";
  protected final String TEXT_479 = " = null;";
  protected final String TEXT_480 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_481 = "ESet = false;";
  protected final String TEXT_482 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_483 = ".UNSET, ";
  protected final String TEXT_484 = "isSetChange ? old";
  protected final String TEXT_485 = " : null";
  protected final String TEXT_486 = ", null, ";
  protected final String TEXT_487 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_488 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_489 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_490 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_491 = NL + "\tvoid unset";
  protected final String TEXT_492 = NL + "\tpublic void unset";
  protected final String TEXT_493 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_494 = NL + "\t\teUnset(";
  protected final String TEXT_495 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_496 = " != null) ((";
  protected final String TEXT_497 = ".Unsettable";
  protected final String TEXT_498 = ").unset();";
  protected final String TEXT_499 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_500 = " msgs = null;";
  protected final String TEXT_501 = NL + "\t\t\tmsgs = ";
  protected final String TEXT_502 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_503 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_504 = ", null, null, old";
  protected final String TEXT_505 = " = eVirtualUnset(";
  protected final String TEXT_506 = "_EFLAG_DEFAULT;";
  protected final String TEXT_507 = " : ";
  protected final String TEXT_508 = "()).featureMap()).clear(";
  protected final String TEXT_509 = "()).clear(";
  protected final String TEXT_510 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_511 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_512 = " is set.";
  protected final String TEXT_513 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_514 = NL + "\tboolean isSet";
  protected final String TEXT_515 = NL + "\tpublic boolean isSet";
  protected final String TEXT_516 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_517 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_518 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_519 = " != null && ((";
  protected final String TEXT_520 = ").isSet();";
  protected final String TEXT_521 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_522 = NL + "\t\treturn !((";
  protected final String TEXT_523 = "()).featureMap()).isEmpty(";
  protected final String TEXT_524 = "()).isEmpty(";
  protected final String TEXT_525 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_526 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_527 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_528 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_529 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_530 = "_ESUBSETS = ";
  protected final String TEXT_531 = ";" + NL;
  protected final String TEXT_532 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_533 = "_ESUPERSETS = ";
  protected final String TEXT_534 = NL + "\t/**";
  protected final String TEXT_535 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_536 = "}, with the specified ";
  protected final String TEXT_537 = ", and appends it to the '<em><b>";
  protected final String TEXT_538 = ", and sets the '<em><b>";
  protected final String TEXT_539 = "} and appends it to the '<em><b>";
  protected final String TEXT_540 = "} and sets the '<em><b>";
  protected final String TEXT_541 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_542 = NL + "\t * @param ";
  protected final String TEXT_543 = " The ";
  protected final String TEXT_544 = " for the new {@link ";
  protected final String TEXT_545 = "}, or <code>null</code>.";
  protected final String TEXT_546 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_547 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_548 = "}." + NL + "\t * @see #";
  protected final String TEXT_549 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_550 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_551 = NL + "\t";
  protected final String TEXT_552 = " create";
  protected final String TEXT_553 = " eClass);" + NL;
  protected final String TEXT_554 = NL + "\tpublic ";
  protected final String TEXT_555 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_556 = ") create(eClass);";
  protected final String TEXT_557 = "().add(new";
  protected final String TEXT_558 = NL + "\t\tset";
  protected final String TEXT_559 = NL + "\t\tint ";
  protected final String TEXT_560 = "ListSize = 0;";
  protected final String TEXT_561 = "Size = ";
  protected final String TEXT_562 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_563 = "Size > ";
  protected final String TEXT_564 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_565 = "ListSize = ";
  protected final String TEXT_566 = "Size;";
  protected final String TEXT_567 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_568 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_569 = ".create";
  protected final String TEXT_570 = "i < ";
  protected final String TEXT_571 = "Size ? (";
  protected final String TEXT_572 = ".get(i) : null";
  protected final String TEXT_573 = ");" + NL + "\t\t}";
  protected final String TEXT_574 = NL + "\t\tif (";
  protected final String TEXT_575 = NL + "\t\t\tnew";
  protected final String TEXT_576 = "().addAll(";
  protected final String TEXT_577 = ".set";
  protected final String TEXT_578 = NL + "\t\treturn new";
  protected final String TEXT_579 = ";" + NL + "\t}" + NL;
  protected final String TEXT_580 = "},with the specified ";
  protected final String TEXT_581 = NL + "\t * @return The new {@link ";
  protected final String TEXT_582 = ");" + NL;
  protected final String TEXT_583 = ")" + NL + "\t{";
  protected final String TEXT_584 = NL + "\t\treturn create";
  protected final String TEXT_585 = ") create(";
  protected final String TEXT_586 = NL + "\t}" + NL;
  protected final String TEXT_587 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_588 = "} with the specified ";
  protected final String TEXT_589 = " from the '<em><b>";
  protected final String TEXT_590 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_591 = " of the {@link ";
  protected final String TEXT_592 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_593 = NL + "\t * @return The first {@link ";
  protected final String TEXT_594 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_595 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_596 = ", false";
  protected final String TEXT_597 = ", null";
  protected final String TEXT_598 = ");" + NL + "\t}" + NL;
  protected final String TEXT_599 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_600 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_601 = "} on demand if not found.";
  protected final String TEXT_602 = ", boolean ignoreCase";
  protected final String TEXT_603 = " eClass";
  protected final String TEXT_604 = ", boolean createOnDemand";
  protected final String TEXT_605 = "Loop: for (";
  protected final String TEXT_606 = "())" + NL + "\t\t{";
  protected final String TEXT_607 = " i = ";
  protected final String TEXT_608 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_609 = ") i.next();";
  protected final String TEXT_610 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_611 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_612 = "Loop;";
  protected final String TEXT_613 = "List = ";
  protected final String TEXT_614 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_615 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_616 = " || (";
  protected final String TEXT_617 = ".size() != ";
  protected final String TEXT_618 = "ListSize";
  protected final String TEXT_619 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_620 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_621 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_622 = "List.get(j);";
  protected final String TEXT_623 = NL + "\t\t\t\tif (";
  protected final String TEXT_624 = " != null && !(ignoreCase ? (";
  protected final String TEXT_625 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_626 = "()) : ";
  protected final String TEXT_627 = ".get(j).equals(";
  protected final String TEXT_628 = "())))";
  protected final String TEXT_629 = " != null && !";
  protected final String TEXT_630 = "()))";
  protected final String TEXT_631 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_632 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_633 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_634 = " != null && !(ignoreCase ? ";
  protected final String TEXT_635 = ".equalsIgnoreCase(";
  protected final String TEXT_636 = ".equals(";
  protected final String TEXT_637 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_638 = NL + "\t\t\treturn ";
  protected final String TEXT_639 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_640 = " && eClass != null";
  protected final String TEXT_641 = " ? create";
  protected final String TEXT_642 = ", eClass";
  protected final String TEXT_643 = ") : null;";
  protected final String TEXT_644 = NL + "\t\treturn null;";
  protected final String TEXT_645 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_646 = "()" + NL + "\t{";
  protected final String TEXT_647 = NL + "  \t\treturn false;";
  protected final String TEXT_648 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_649 = NL + "\t\treturn !((";
  protected final String TEXT_650 = ".Internal.Wrapper)";
  protected final String TEXT_651 = "()).featureMap().isEmpty();";
  protected final String TEXT_652 = ".featureMap().isEmpty();";
  protected final String TEXT_653 = ".isEmpty();";
  protected final String TEXT_654 = ");" + NL + "\t\treturn ";
  protected final String TEXT_655 = NL + "\t\treturn !";
  protected final String TEXT_656 = "().isEmpty();";
  protected final String TEXT_657 = " != null;";
  protected final String TEXT_658 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_659 = ") != null;";
  protected final String TEXT_660 = NL + "\t\treturn basicGet";
  protected final String TEXT_661 = "() != null;";
  protected final String TEXT_662 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_663 = "_EFLAG) != 0) != ";
  protected final String TEXT_664 = NL + "\t\t\t\treturn (";
  protected final String TEXT_665 = "_EFLAG) != ";
  protected final String TEXT_666 = ") != ";
  protected final String TEXT_667 = "() != ";
  protected final String TEXT_668 = " != null : !";
  protected final String TEXT_669 = "() != null : !";
  protected final String TEXT_670 = "());";
  protected final String TEXT_671 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_672 = NL + "\t\treturn (";
  protected final String TEXT_673 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_674 = ") <em>";
  protected final String TEXT_675 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_676 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_677 = "__EOCL_EXP = \"";
  protected final String TEXT_678 = NL;
  protected final String TEXT_679 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_680 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_681 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_682 = "__EOCL_INV;" + NL;
  protected final String TEXT_683 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_684 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_685 = "<";
  protected final String TEXT_686 = ">";
  protected final String TEXT_687 = "__EOCL_QRY;" + NL;
  protected final String TEXT_688 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_689 = "__EEXPRESSION = \"";
  protected final String TEXT_690 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_691 = ".Internal.InvocationDelegate ";
  protected final String TEXT_692 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_693 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_694 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_695 = "</em>}' </li>";
  protected final String TEXT_696 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_697 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_698 = NL + "\t * ";
  protected final String TEXT_699 = NL + "\t *   ";
  protected final String TEXT_700 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_701 = NL + "\t * @model ";
  protected final String TEXT_702 = NL + "\t *        ";
  protected final String TEXT_703 = NL + "\t * @model";
  protected final String TEXT_704 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_705 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_706 = NL + "\t{";
  protected final String TEXT_707 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_708 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_709 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_710 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_711 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_712 = "\",";
  protected final String TEXT_713 = NL + "\t\t\t\t ";
  protected final String TEXT_714 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_715 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_716 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_717 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_718 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_719 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_720 = " = helper.createInvariant(";
  protected final String TEXT_721 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_722 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_723 = ").check(this))";
  protected final String TEXT_724 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_725 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_726 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_727 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_728 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_729 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_730 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_731 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_732 = "\", ";
  protected final String TEXT_733 = ".getObjectLabel(this, ";
  protected final String TEXT_734 = ") }),";
  protected final String TEXT_735 = NL + "\t\t\t\t\t\t new Object [] { this }));";
  protected final String TEXT_736 = NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_737 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_738 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_739 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_740 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_741 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_742 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_743 = "(this";
  protected final String TEXT_744 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_745 = ".getEAllOperations().get(";
  protected final String TEXT_746 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_747 = " = helper.createQuery(";
  protected final String TEXT_748 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_749 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_750 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_751 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_752 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_753 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_754 = "> result = (";
  protected final String TEXT_755 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_756 = ".UnmodifiableEList<";
  protected final String TEXT_757 = ">(result.size(), result.toArray());";
  protected final String TEXT_758 = NL + "\t\treturn ((";
  protected final String TEXT_759 = ") query.evaluate(this)).";
  protected final String TEXT_760 = ") query.evaluate(this);";
  protected final String TEXT_761 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_762 = " eInverseAdd(";
  protected final String TEXT_763 = " otherEnd, int featureID, ";
  protected final String TEXT_764 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_765 = ")" + NL + "\t\t{";
  protected final String TEXT_766 = NL + "\t\t\tcase ";
  protected final String TEXT_767 = ":";
  protected final String TEXT_768 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_769 = ".InternalMapView";
  protected final String TEXT_770 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_771 = NL + "\t\t\t\treturn (";
  protected final String TEXT_772 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_773 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_774 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_775 = ")otherEnd, msgs);";
  protected final String TEXT_776 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_777 = NL + "\t\t\t\tif (";
  protected final String TEXT_778 = NL + "\t\t\t\t\tmsgs = ";
  protected final String TEXT_779 = NL + "\t\t\tdefault:";
  protected final String TEXT_780 = "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_781 = "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_782 = " eInverseRemove(";
  protected final String TEXT_783 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_784 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_785 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_786 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_787 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_788 = "(msgs);";
  protected final String TEXT_789 = "(null, msgs);";
  protected final String TEXT_790 = "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_791 = "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_792 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_793 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_794 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_795 = "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_796 = "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_797 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_798 = NL + "\t\t\t\treturn ";
  protected final String TEXT_799 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_800 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_801 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_802 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_803 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_804 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_805 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_806 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_807 = "().map();";
  protected final String TEXT_808 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_809 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_810 = "()).getWrapper();";
  protected final String TEXT_811 = "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_812 = "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_813 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_814 = NL + "\t\t\t\t((";
  protected final String TEXT_815 = "()).featureMap()).set(newValue);";
  protected final String TEXT_816 = "()).set(newValue);";
  protected final String TEXT_817 = ".Setting)((";
  protected final String TEXT_818 = "()).eMap()).set(newValue);";
  protected final String TEXT_819 = ".Setting)";
  protected final String TEXT_820 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_821 = "().addAll((";
  protected final String TEXT_822 = "<? extends ";
  protected final String TEXT_823 = ")newValue);";
  protected final String TEXT_824 = NL + "\t\t\t\tset";
  protected final String TEXT_825 = "(((";
  protected final String TEXT_826 = ")newValue).";
  protected final String TEXT_827 = "newValue);";
  protected final String TEXT_828 = NL + "\t\t\t\treturn;";
  protected final String TEXT_829 = "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_830 = "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_831 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_832 = "()).featureMap().clear();";
  protected final String TEXT_833 = "().clear();";
  protected final String TEXT_834 = NL + "\t\t\t\tunset";
  protected final String TEXT_835 = ")null);";
  protected final String TEXT_836 = "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_837 = "\t\teDynamicUnset(featureID);";
  protected final String TEXT_838 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_839 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_840 = NL + "\t\t\tcase ";
  protected final String TEXT_841 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_842 = NL + "\t\t\t\treturn ";
  protected final String TEXT_843 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_844 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_845 = NL + "\t\t\t\treturn !";
  protected final String TEXT_846 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_847 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_848 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_849 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_850 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_851 = " baseClass)" + NL + "\t{";
  protected final String TEXT_852 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_853 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_854 = NL + "\t\t\t\tcase ";
  protected final String TEXT_855 = ": return ";
  protected final String TEXT_856 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_857 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_858 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_859 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_860 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_861 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_862 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_863 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_864 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_865 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_866 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_867 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_868 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_869 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_870 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_871 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_872 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_873 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_874 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_875 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_876 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_877 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_878 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_879 = NL + "\t@SuppressWarnings(";
  protected final String TEXT_880 = "\"unchecked\"";
  protected final String TEXT_881 = "{\"rawtypes\", \"unchecked\" }";
  protected final String TEXT_882 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_883 = " arguments) throws ";
  protected final String TEXT_884 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_885 = NL + "\t\t\t\ttry" + NL + "\t\t\t\t{";
  protected final String TEXT_886 = "arguments.get(";
  protected final String TEXT_887 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_888 = "return null;";
  protected final String TEXT_889 = "return ";
  protected final String TEXT_890 = NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (";
  protected final String TEXT_891 = " throwable)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tthrow new ";
  protected final String TEXT_892 = "(throwable);" + NL + "\t\t\t\t}";
  protected final String TEXT_893 = "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_894 = "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_895 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\t";
  protected final String TEXT_896 = " result = new ";
  protected final String TEXT_897 = "(super.toString());";
  protected final String TEXT_898 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_899 = ": \");";
  protected final String TEXT_900 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_901 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_902 = ")) result.append(eVirtualGet(";
  protected final String TEXT_903 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_904 = "_ESETFLAG) != 0";
  protected final String TEXT_905 = ") result.append((";
  protected final String TEXT_906 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_907 = ") result.append(";
  protected final String TEXT_908 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_909 = "); else result.append(\"<unset>\");";
  protected final String TEXT_910 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_911 = NL + "\t\tresult.append((";
  protected final String TEXT_912 = "_EFLAG) != 0);";
  protected final String TEXT_913 = NL + "\t\tresult.append(";
  protected final String TEXT_914 = "_EFLAG_OFFSET]);";
  protected final String TEXT_915 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_916 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_917 = NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_918 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_919 = NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_920 = " getKey()" + NL + "\t{";
  protected final String TEXT_921 = "(getTypedKey());";
  protected final String TEXT_922 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_923 = NL + "\tpublic void setKey(";
  protected final String TEXT_924 = " key)" + NL + "\t{";
  protected final String TEXT_925 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_926 = "key);";
  protected final String TEXT_927 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_928 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_929 = ")key).";
  protected final String TEXT_930 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_931 = ")key);";
  protected final String TEXT_932 = " getValue()" + NL + "\t{";
  protected final String TEXT_933 = "(getTypedValue());";
  protected final String TEXT_934 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_935 = " setValue(";
  protected final String TEXT_936 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_937 = " oldValue = getValue();";
  protected final String TEXT_938 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_939 = "value);";
  protected final String TEXT_940 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_941 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_942 = ")value).";
  protected final String TEXT_943 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_944 = ")value);";
  protected final String TEXT_945 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_946 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_947 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_948 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_949 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_950 = " EOCL_ENV = ";
  protected final String TEXT_951 = ".newInstance();" + NL;
  protected final String TEXT_952 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_953 = " create(";
  protected final String TEXT_954 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_955 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_956 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_957 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_958 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_959 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_960 = ".getInstance();" + NL + "\t}" + NL;
  protected final String TEXT_961 = NL + "\tprotected ";
  protected final String TEXT_962 = "Helper(";
  protected final String TEXT_963 = ".addAll(super.";
  protected final String TEXT_964 = NL + "\t\tsuper.";
  protected final String TEXT_965 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_966 = " i = ((";
  protected final String TEXT_967 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_968 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_969 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_970 = "();" + NL + "\t\tif (!";
  protected final String TEXT_971 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_972 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_973 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_974 = ".addAll(";
  protected final String TEXT_975 = "());" + NL + "\t\t}";
  protected final String TEXT_976 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_977 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_978 = ".add(";
  protected final String TEXT_979 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_980 = NL + "\tpublic boolean isSet";
  protected final String TEXT_981 = NL + "\t\treturn super.isSet";
  protected final String TEXT_982 = NL + "\t\treturn isSet";
  protected final String TEXT_983 = "().isEmpty()";
  protected final String TEXT_984 = "() != null";
  protected final String TEXT_985 = NL + "\t\t\t|| isSet";
  protected final String TEXT_986 = NL + "\t\t\t|| !";
  protected final String TEXT_987 = NL + "\t\t\t|| ";
  protected final String TEXT_988 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_989 = NL + "\t\treturn false;";
  protected final String TEXT_990 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_991 = "());" + NL + "\t\treturn ";
  protected final String TEXT_992 = "();" + NL + "\t\t";
  protected final String TEXT_993 = ");" + NL + "\t\t}" + NL + "\t\treturn new ";
  protected final String TEXT_994 = ".size(), ";
  protected final String TEXT_995 = ".toArray());";
  protected final String TEXT_996 = " msgs)" + NL + "\t{";
  protected final String TEXT_997 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_998 = NL + "\t\treturn basicSet";
  protected final String TEXT_999 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_1000 = NL + "\tpublic void set";
  protected final String TEXT_1001 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2019 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Alexander Fedorov <alexander.fedorov@arsysop.ru> - Bug 546714
 */

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]); final boolean useInterfaceOverrideAnnotation = genModel.useInterfaceOverrideAnnotation() && !(isInterface && isImplementation);
    final boolean isGWT = genModel.getRuntimePlatform() == GenRuntimePlatform.GWT;
    final boolean forceDefaultCase = genModel.isSwitchMissingDefaultCase();String indentDefaultCase = forceDefaultCase ? "\t\t" : "";
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    final String negativeOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " - EOPERATION_OFFSET_CORRECTION" : "";
    final String positiveOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " + EOPERATION_OFFSET_CORRECTION" : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    }}
    stringBuffer.append(TEXT_4);
    if (isInterface) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_7);
    if (isInterface) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_9);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_13);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_17);
    }
    }
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_12);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_22);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_24);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    if (genClass.hasImplicitAPITags(true)) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genClass.getImplicitAPITags(genModel.getIndentation(stringBuffer), true));
    }
    stringBuffer.append(TEXT_26);
    //Class/interface.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_9);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_28);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_12);
    if (genClass.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genClass.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_26);
    }
    if (isJDK50 && genClass.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_29);
    }
    if (isImplementation) {
    if (isJDK50 && !genClass.hasAPIDeprecatedTag() && GenModelUtil.hasImplicitAPIDeprecatedTag(genClass.getEGetGenFeatures(), genClass.getEIsSetGenFeatures(), genClass.getESetGenFeatures(), genClass.getEUnsetGenFeatures(), genClass.getEInverseAddGenFeatures(), genClass.getEInverseRemoveGenFeatures(), genClass.getEBasicRemoveFromContainerGenFeatures(), genClass.getToStringGenFeatures())) {
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_35);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_7);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_7);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_41);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_42);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_44);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_45);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_46);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_47);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_45);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_48);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_49);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_56);
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_60);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_45);
    }
    }
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_68);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_45);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_56);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_60);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_45);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (genFeature.isStaticDefaultValueUncheckedCast()) {
    stringBuffer.append(TEXT_73);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_75);
    } else {
    stringBuffer.append(TEXT_76);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_7);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_77);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_49);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_79);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_79);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_83);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_84);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_89);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_91);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_92);
    } else {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_87);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_101);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_45);
    } else {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_45);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_77);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_49);
    }
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_103);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_45);
    } else {
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_103);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_54);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_107);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_45);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_45);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_45);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_36);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_116);
    } else {
    stringBuffer.append(TEXT_117);
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_118);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_121);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_123);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_126);
    }
    if (isImplementation && genModel.isDynamicDelegation()) {
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    if (genClass.hasStaticFeatures()) {
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? "0" : genClass.hasStaticFeatures() ? "ESTATIC_FEATURE_COUNT" : Integer.toString(genClass.getClassExtendsGenClass().getAllGenFeatures().size()));
    stringBuffer.append(TEXT_126);
    }
    //Class/reflectiveDelegation.override.javajetinc
    if (isImplementation) {
    new Runnable() { public void run() { GenClass classExtendsGenClass = genClass.getClassExtendsGenClass(); List<GenFeature> classExtendsAllGenFeatures = classExtendsGenClass == null? Collections.<GenFeature>emptyList() : classExtendsGenClass.getAllGenFeatures();
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_73);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (useInterfaceOverrideAnnotation || classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_132);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_135);
    } else {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_141);
    }
    if (genFeature.isGet() && genFeature.isListType()) {
    stringBuffer.append(TEXT_142);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    // Check that the annotation wouldn't be emitted also by the base Ecore template (bug 547424). 
    if (!(useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingGetAccessorOperation(genFeature) && !genFeature.isSuppressedGetVisibility())) {
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    if (genFeature.isListType() && genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_73);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (useInterfaceOverrideAnnotation || classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_132);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_126);
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_154);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_159);
    }
    if (genFeature.isSet() && !(!genModel.isReflectiveDelegation() && genFeature.isBasicSet())) {
    stringBuffer.append(TEXT_154);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    // Check that the annotation wouldn't be emitted also by the base Ecore template (bug 547424). 
    if (!(useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingSetAccessorOperation(genFeature) && !genFeature.isSuppressedSetVisibility())) {
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_162);
    }
    }
    //Class/genFeatureReified.override.javajetinc
    }}}.run();}
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (!isImplementation) {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_164);
    } else {
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_73);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_132);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_135);
    } else {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_141);
    }
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_166);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_167);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_170);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_172);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_174);
    } else {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_177);
    }
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_180);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_162);
    }
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_185);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_187);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    if (genFeature.isListType() && genFeature.getEcoreFeature().getEGenericType().getETypeParameter() == null) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_191);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_193);
    } else {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_195);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_193);
    } else {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_196);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = "<code>" + CodeGenUtil.xmlEscapeEncode(typeName.substring(index)) + "</code>"; }

    stringBuffer.append(TEXT_197);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_193);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_190);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_199);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_201);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(reverseGenFeature.getGenClass().getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_203);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_204);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(TEXT_207);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_208);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(TEXT_207);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_86);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(reverseGenFeature.getGenClass().getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_219);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_220);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_221);
    }}
    stringBuffer.append(TEXT_112);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    // Check that the annotation wouldn't be emitted also by the base Ecore template (bug 547424). 
    if (!(useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingGetAccessorOperation(genFeature) && !genFeature.isSuppressedGetVisibility())) {
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_164);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || (genModel.isDynamicDelegation() && !genFeature.isVolatile())) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_73);
    }
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingGetAccessorOperation(genFeature) && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_132);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_173);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_86);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_6);
    } else if (genModel.isReflectiveDelegation()) {
    if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_173);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_227);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_6);
    }
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_173);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_228);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_6);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_6);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_86);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_231);
    } else {
    stringBuffer.append(TEXT_232);
    }
    stringBuffer.append(TEXT_233);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), false));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_241);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), false));
    stringBuffer.append(TEXT_6);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_245);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_248);
    }
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_250);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_253);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_256);
    }
    stringBuffer.append(TEXT_257);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_263);
    }
    stringBuffer.append(TEXT_264);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_147);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    } else {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_270);
    }
    } else {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), false));
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_263);
    } else {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_282);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_173);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_227);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_173);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_289);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_227);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_6);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_292);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_293);
    }
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_296);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_299);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_300);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_302);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_303);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_304);
    }
    stringBuffer.append(TEXT_305);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_306);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_308);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_293);
    }
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_304);
    }
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_6);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_314);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_260);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_325);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_328);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_260);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_325);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_260);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_325);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_335);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_338);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_340);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_338);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_304);
    }
    }
    }
    }
    stringBuffer.append(TEXT_305);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    } else {
    stringBuffer.append(TEXT_325);
    }
    stringBuffer.append(TEXT_6);
    }
    } else {
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_346);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_177);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_132);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_147);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_173);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_349);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_6);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_350);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_352);
    } else {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_282);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_352);
    }
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_306);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_337);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_338);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_340);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_338);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_354);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_304);
    }
    }
    }
    }
    stringBuffer.append(TEXT_305);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    } else {
    stringBuffer.append(TEXT_325);
    }
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_356);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_177);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_357);
    if (genFeature.isContainer()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), false));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_365);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_366);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_369);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_372);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    }
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_385);
    } else if (genModel.isDynamicDelegation()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), false));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_365);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_366);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_369);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_372);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    }
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_385);
    } else if (!genFeature.isVolatile()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_333);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_6);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_393);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_400);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_401);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_406);
    } else {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_410);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_366);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_369);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_372);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    }
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_385);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_365);
    } else {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_365);
    }
    } else {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_415);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_177);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(TEXT_417);
    if (isImplementation) {
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_419);
    }
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    }
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    // Check that the annotation wouldn't be emitted also by the base Ecore template (bug 547424). 
    if (!(useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingSetAccessorOperation(genFeature) && !genFeature.isSuppressedSetVisibility())) {
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_422);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingSetAccessorOperation(genFeature) && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_423);
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_333);
    }
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_6);
    }
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_147);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_147);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_429);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_147);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), true));
    stringBuffer.append(TEXT_255);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_440);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_263);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_444);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), true));
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_253);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_247);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), true));
    stringBuffer.append(TEXT_255);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_256);
    }
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_440);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_449);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    }
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_400);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_454);
    }
    stringBuffer.append(TEXT_455);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_263);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_270);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_459);
    } else {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_463);
    if (isJDK50) {
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_84);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_465);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_6);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_6);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_393);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_400);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_150);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_406);
    } else {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_263);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_150);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_263);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_366);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_369);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_372);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    }
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_333);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_147);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_346);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_177);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_357);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getAsInternalEObject("", false));
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_365);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    }
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_479);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_480);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_481);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_485);
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_486);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_406);
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_487);
    }
    } else {
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_415);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_177);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(TEXT_490);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_86);
    }
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_164);
    } else {
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingUnsetAccessorOperation(genFeature) && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_132);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_495);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_498);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_500);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_253);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_247);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_256);
    }
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_503);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    }
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_481);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_454);
    }
    stringBuffer.append(TEXT_455);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_270);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_6);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_480);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    } else {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_479);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_481);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_485);
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_486);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_406);
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_263);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_459);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_506);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_481);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_150);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_406);
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_263);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_306);
    } else {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_346);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_177);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_512);
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_512);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_86);
    }
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_111);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_112);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_55);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_164);
    } else {
    if (useInterfaceOverrideAnnotation  && !genClass.isMapEntry() && !genClass.hasCollidingIsSetAccessorOperation(genFeature) && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_132);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_518);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_520);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    } else {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_306);
    } else {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_526);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_177);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_531);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_531);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_534);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    }
    }
    stringBuffer.append(TEXT_541);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_545);
    }
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    }
    } else {
    stringBuffer.append(TEXT_550);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_553);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_556);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_560);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_566);
    index++;}
    stringBuffer.append(TEXT_567);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_93);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_572);
    }
    stringBuffer.append(TEXT_573);
    } else {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_93);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_147);
    }
    } else {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_444);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_147);
    }
    index++;}
    }
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_579);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_534);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_536);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    }
    }
    stringBuffer.append(TEXT_541);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_545);
    }
    stringBuffer.append(TEXT_581);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    }
    } else {
    stringBuffer.append(TEXT_550);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_582);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_583);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_147);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_560);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_566);
    index++;}
    stringBuffer.append(TEXT_567);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_93);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_572);
    }
    stringBuffer.append(TEXT_573);
    } else {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_93);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_147);
    }
    } else {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_444);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_147);
    }
    index++;}
    }
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_586);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_590);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_592);
    }
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    }
    } else {
    stringBuffer.append(TEXT_550);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_582);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_596);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_597);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_596);
    }
    stringBuffer.append(TEXT_598);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_590);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_592);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_599);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_592);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_601);
    }
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    }
    } else {
    stringBuffer.append(TEXT_550);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_602);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_603);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_604);
    }
    stringBuffer.append(TEXT_582);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_602);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_603);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_604);
    }
    stringBuffer.append(TEXT_583);
    if (isJDK50) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_606);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_609);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_615);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_617);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_618);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_86);
    }
    }
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_620);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_76);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_456);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_622);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_623);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_624);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_628);
    } else {
    stringBuffer.append(TEXT_623);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    index++;}
    stringBuffer.append(TEXT_384);
    } else {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_634);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_628);
    } else {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_634);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_628);
    } else {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    index++;}
    }
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_304);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_639);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_640);
    }
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_642);
    }
    stringBuffer.append(TEXT_643);
    } else {
    stringBuffer.append(TEXT_644);
    }
    stringBuffer.append(TEXT_586);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_646);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_647);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_652);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    } else {
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_656);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_661);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_661);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_506);
    }
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_670);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_520);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_147);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_306);
    } else {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_526);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_586);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_677);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_678);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_682);
    } else {
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_686);
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_687);
    }
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_678);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_691);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_693);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_534);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_694);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_674);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_695);
    }
    stringBuffer.append(TEXT_696);
    }
    stringBuffer.append(TEXT_541);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_697);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_700);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_701);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_703);
    }}
    stringBuffer.append(TEXT_704);
    } else {
    stringBuffer.append(TEXT_550);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_531);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_705);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_706);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant() && (genOperation.hasInvariantExpression() || !genOperation.hasInvocationDelegate())) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_707);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_709);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_710);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_147);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_147);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_574);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_718);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_720);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_723);
    } else {
    stringBuffer.append(TEXT_724);
    }
    stringBuffer.append(TEXT_725);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_374);
    stringBuffer.append(TEXT_319);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_728);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_735);
    //genOperation.diagnostics.override.javajetinc
    stringBuffer.append(TEXT_736);
    }
    }
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_737);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_738);
    if (size > 0) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_739);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_86);
    } else {
    stringBuffer.append(TEXT_325);
    }
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_638);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_738);
    if (size > 0) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_739);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_86);
    } else {
    stringBuffer.append(TEXT_325);
    }
    stringBuffer.append(TEXT_86);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_742);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_743);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_147);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_292);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_293);
    }
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_296);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_299);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_300);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_743);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_86);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_303);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_304);
    }
    stringBuffer.append(TEXT_305);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_743);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_147);
    }
    } else if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclQry = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_QRY";
		GenOperation redefinedGenOperation = genOperation;
		while (UML2GenModelUtil.isDuplicate(redefinedGenOperation)) {
			java.util.List<GenOperation> redefinedGenOperations = UML2GenModelUtil.getRedefinedGenOperations(redefinedGenOperation);
			if (redefinedGenOperations.size() > 0) {
				redefinedGenOperation = redefinedGenOperations.get(0);
			} else {
			break;
			}
		}
		int index = genOperation.getGenClass().getAllGenOperations().indexOf(redefinedGenOperation);
    stringBuffer.append(TEXT_574);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_745);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_746);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_747);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_749);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_147);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_750);
    }
    stringBuffer.append(TEXT_751);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_753);
    }
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_757);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_233);
    } else {
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_760);
    }
    } else {
    stringBuffer.append(TEXT_761);
    }
    }
    stringBuffer.append(TEXT_586);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_128);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_73);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_764);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_765);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_767);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_770);
    } else {
    stringBuffer.append(TEXT_771);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_772);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_773);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_775);
    } else {
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_365);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_147);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_233);
    }
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_444);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_253);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_247);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_256);
    }
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_775);
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_779);
    } else {
    stringBuffer.append(TEXT_455);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_780);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_781);
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_455);
    }
    stringBuffer.append(TEXT_177);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_764);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_765);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_767);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_783);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_784);
    } else {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_785);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_365);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_788);
    } else {
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_789);
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_779);
    } else { // {
    stringBuffer.append(TEXT_455);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_790);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_791);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_455);
    } // }
    stringBuffer.append(TEXT_177);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_765);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_794);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_256);
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_779);
    } else { // {
    stringBuffer.append(TEXT_455);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_795);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_796);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_455);
    } // }
    stringBuffer.append(TEXT_177);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_797);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_765);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_767);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_799);
    } else {
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_670);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_233);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_807);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_810);
    } else {
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_779);
    } else { // {
    stringBuffer.append(TEXT_455);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_811);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_812);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_455);
    } // }
    stringBuffer.append(TEXT_177);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_128);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_73);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_813);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_765);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_767);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_815);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_816);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_818);
    } else {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_816);
    }
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_686);
    }
    stringBuffer.append(TEXT_823);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_670);
    } else {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_827);
    }
    stringBuffer.append(TEXT_828);
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_779);
    } else { // {
    stringBuffer.append(TEXT_455);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_829);
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_828);
    }
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_830);
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_828);
    }
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_455);
    } // }
    stringBuffer.append(TEXT_177);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_831);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_765);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_767);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_832);
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_833);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_233);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_835);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_495);
    } else {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_828);
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_779);
    } else { // {
    stringBuffer.append(TEXT_455);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_836);
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_828);
    }
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_837);
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_828);
    }
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_455);
    } // }
    stringBuffer.append(TEXT_177);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_838);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_705);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_839);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_767);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_233);
    } else {
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_233);
    } else {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_518);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    } else {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_629);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_652);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_629);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_653);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_844);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_629);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_653);
    } else {
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_656);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_233);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_657);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_661);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_657);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_661);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_506);
    }
    } else {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_147);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_670);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_333);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_848);
    } else {
    stringBuffer.append(TEXT_849);
    }
    stringBuffer.append(TEXT_586);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_850);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_851);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_241);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_856);
    }
    stringBuffer.append(TEXT_857);
    }
    stringBuffer.append(TEXT_858);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_859);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_851);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_860);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_856);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_241);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_856);
    }
    stringBuffer.append(TEXT_862);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_863);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_851);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_864);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_6);
    }
    }
    stringBuffer.append(TEXT_865);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_864);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_854);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_856);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_241);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_856);
    }
    stringBuffer.append(TEXT_867);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_868);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_869);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_870);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_871);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_872);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_873);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_874);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_875);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_876);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_877);
    }
    stringBuffer.append(TEXT_878);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    if (genModel.useGenerics()) {
    boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
    if (isUnchecked) {
    stringBuffer.append(TEXT_879);
    if (!isRaw) {
    stringBuffer.append(TEXT_880);
    } else {
    stringBuffer.append(TEXT_881);
    }
    stringBuffer.append(TEXT_86);
    }
    }
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_884);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_765);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();  boolean hasCheckedException = genOperation.hasCheckedException(); String indent = hasCheckedException ? "\t" : ""; GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(TEXT_767);
    if (hasCheckedException) {
    stringBuffer.append(TEXT_885);
    /*}*/}
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(indent);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_886);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_86);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_150);
    }
    }
    stringBuffer.append(TEXT_887);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_888);
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_889);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_93);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_886);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_86);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_150);
    }
    }
    stringBuffer.append(TEXT_86);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_6);
    }
    if (hasCheckedException) {/*{*/
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genModel.getImportedName("java.lang.Throwable"));
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_892);
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_779);
    } else { // {
    stringBuffer.append(TEXT_455);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_893);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_894);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_455);
    } // }
    stringBuffer.append(TEXT_177);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_128);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genModel.useGenerics() ? "StringBuilder" : "StringBuffer");
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genModel.useGenerics() ? "StringBuilder" : "StringBuffer");
    stringBuffer.append(TEXT_897);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_136);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_904);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_136);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_904);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_136);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_904);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_263);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_912);
    } else {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_914);
    }
    } else {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_915);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_128);
    if (isGWT) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_916);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_917);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_918);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_919);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_920);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_921);
    } else {
    stringBuffer.append(TEXT_922);
    }
    stringBuffer.append(TEXT_123);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_923);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_924);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_925);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_926);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_927);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_929);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_670);
    } else {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_931);
    }
    stringBuffer.append(TEXT_123);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_932);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_933);
    } else {
    stringBuffer.append(TEXT_934);
    }
    stringBuffer.append(TEXT_123);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_935);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_936);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_937);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_938);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_939);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_940);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_941);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_670);
    } else {
    stringBuffer.append(TEXT_943);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_944);
    }
    stringBuffer.append(TEXT_945);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_73);
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_948);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && (!UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass()) || UML2GenModelUtil.isOperationsClasses(genClass.getClassExtendsGenClass().getGenPackage()))) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_951);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_955);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_960);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_550);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_583);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_670);
    } else {
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_686);
    }
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_968);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_686);
    }
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_968);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_686);
    }
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_968);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_975);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_975);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_573);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_978);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_975);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_76);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_341);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_978);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_573);
    }
    }
    }
    }
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_579);
    }
    }
    }
    stringBuffer.append(TEXT_550);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_646);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_982);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_6);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_655);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_983);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_6);
    }
    } else {
    stringBuffer.append(TEXT_305);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_984);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_6);
    }
    }
    } else {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_86);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_6);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_985);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_6);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_983);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_6);
    }
    } else {
    stringBuffer.append(TEXT_987);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_984);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_6);
    }
    }
    } else {
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_86);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_6);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_233);
    } else {
    stringBuffer.append(TEXT_989);
    }
    }
    stringBuffer.append(TEXT_586);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_550);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    // Check that the annotation wouldn't be emitted also by the base Ecore template (bug 547424). 
    if (!(useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingGetAccessorOperation(genFeature) && !genFeature.isSuppressedGetVisibility())) {
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_646);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_86);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_991);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    }
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_992);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_978);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_260);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_325);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_995);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_644);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_233);
    }
    }
    stringBuffer.append(TEXT_586);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_550);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_646);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_644);
    } else {
    stringBuffer.append(TEXT_305);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_233);
    }
    stringBuffer.append(TEXT_586);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_550);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_996);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_997);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_333);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_456);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_365);
    } else {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_456);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_999);
    }
    }
    stringBuffer.append(TEXT_586);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_550);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    // Check that the annotation wouldn't be emitted also by the base Ecore template (bug 547424). 
    if (!(useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingSetAccessorOperation(genFeature) && !genFeature.isSuppressedSetVisibility())) {
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    }
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_583);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_997);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_558);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_456);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_586);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_531);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_531);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_534);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    }
    }
    stringBuffer.append(TEXT_541);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_545);
    }
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    }
    } else {
    stringBuffer.append(TEXT_550);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_553);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_556);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_560);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_566);
    index++;}
    stringBuffer.append(TEXT_567);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_93);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_572);
    }
    stringBuffer.append(TEXT_573);
    } else {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_93);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_147);
    }
    } else {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_444);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_147);
    }
    index++;}
    }
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_579);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_534);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_536);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_190);
    }
    }
    stringBuffer.append(TEXT_541);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_545);
    }
    stringBuffer.append(TEXT_581);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    }
    } else {
    stringBuffer.append(TEXT_550);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_582);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_583);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_147);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_560);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_566);
    index++;}
    stringBuffer.append(TEXT_567);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_93);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_572);
    }
    stringBuffer.append(TEXT_573);
    } else {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_93);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_147);
    }
    } else {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_444);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_147);
    }
    index++;}
    }
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_586);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_590);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_592);
    }
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    }
    } else {
    stringBuffer.append(TEXT_550);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_582);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_596);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_597);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_596);
    }
    stringBuffer.append(TEXT_598);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_590);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_592);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_599);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_592);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_601);
    }
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    }
    } else {
    stringBuffer.append(TEXT_550);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_602);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_603);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_604);
    }
    stringBuffer.append(TEXT_582);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_602);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_603);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_604);
    }
    stringBuffer.append(TEXT_583);
    if (isJDK50) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_606);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_609);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_615);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_617);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_618);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_86);
    }
    }
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_620);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_76);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_456);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_622);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_623);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_624);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_628);
    } else {
    stringBuffer.append(TEXT_623);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    index++;}
    stringBuffer.append(TEXT_384);
    } else {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_634);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_628);
    } else {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_634);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_628);
    } else {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_612);
    index++;}
    }
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_304);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_639);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_640);
    }
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_642);
    }
    stringBuffer.append(TEXT_643);
    } else {
    stringBuffer.append(TEXT_644);
    }
    stringBuffer.append(TEXT_586);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_646);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_647);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_652);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    } else {
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_656);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_661);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_661);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_506);
    }
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_6);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_670);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_520);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_147);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_396);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_399);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_147);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_306);
    } else {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_526);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_586);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_550);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_143);
    }
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_706);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_147);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_997);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_147);
    }
    }
    stringBuffer.append(TEXT_586);
    }
    }
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
