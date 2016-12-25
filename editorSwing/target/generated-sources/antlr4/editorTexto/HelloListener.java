// Generated from Hello.g4 by ANTLR 4.4

	package editorTexto;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#operadoresComp}.
	 * @param ctx the parse tree
	 */
	void enterOperadoresComp(@NotNull HelloParser.OperadoresCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#operadoresComp}.
	 * @param ctx the parse tree
	 */
	void exitOperadoresComp(@NotNull HelloParser.OperadoresCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#no}.
	 * @param ctx the parse tree
	 */
	void enterNo(@NotNull HelloParser.NoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#no}.
	 * @param ctx the parse tree
	 */
	void exitNo(@NotNull HelloParser.NoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#regresaParametros}.
	 * @param ctx the parse tree
	 */
	void enterRegresaParametros(@NotNull HelloParser.RegresaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#regresaParametros}.
	 * @param ctx the parse tree
	 */
	void exitRegresaParametros(@NotNull HelloParser.RegresaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull HelloParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull HelloParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull HelloParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull HelloParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#lib_const}.
	 * @param ctx the parse tree
	 */
	void enterLib_const(@NotNull HelloParser.Lib_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#lib_const}.
	 * @param ctx the parse tree
	 */
	void exitLib_const(@NotNull HelloParser.Lib_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#libreria}.
	 * @param ctx the parse tree
	 */
	void enterLibreria(@NotNull HelloParser.LibreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#libreria}.
	 * @param ctx the parse tree
	 */
	void exitLibreria(@NotNull HelloParser.LibreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#incremento_decremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento_decremento(@NotNull HelloParser.Incremento_decrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#incremento_decremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento_decremento(@NotNull HelloParser.Incremento_decrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(@NotNull HelloParser.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(@NotNull HelloParser.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#clase}.
	 * @param ctx the parse tree
	 */
	void enterClase(@NotNull HelloParser.ClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#clase}.
	 * @param ctx the parse tree
	 */
	void exitClase(@NotNull HelloParser.ClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#repite}.
	 * @param ctx the parse tree
	 */
	void enterRepite(@NotNull HelloParser.RepiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#repite}.
	 * @param ctx the parse tree
	 */
	void exitRepite(@NotNull HelloParser.RepiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#neg}.
	 * @param ctx the parse tree
	 */
	void enterNeg(@NotNull HelloParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#neg}.
	 * @param ctx the parse tree
	 */
	void exitNeg(@NotNull HelloParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#restriccion}.
	 * @param ctx the parse tree
	 */
	void enterRestriccion(@NotNull HelloParser.RestriccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#restriccion}.
	 * @param ctx the parse tree
	 */
	void exitRestriccion(@NotNull HelloParser.RestriccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull HelloParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull HelloParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void enterComparadores(@NotNull HelloParser.ComparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void exitComparadores(@NotNull HelloParser.ComparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(@NotNull HelloParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(@NotNull HelloParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterTerm2(@NotNull HelloParser.Term2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitTerm2(@NotNull HelloParser.Term2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(@NotNull HelloParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(@NotNull HelloParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(@NotNull HelloParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(@NotNull HelloParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#llamar_objecto}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_objecto(@NotNull HelloParser.Llamar_objectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#llamar_objecto}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_objecto(@NotNull HelloParser.Llamar_objectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#llamarFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamarFuncion(@NotNull HelloParser.LlamarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#llamarFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamarFuncion(@NotNull HelloParser.LlamarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(@NotNull HelloParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(@NotNull HelloParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(@NotNull HelloParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(@NotNull HelloParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compFor}.
	 * @param ctx the parse tree
	 */
	void enterCompFor(@NotNull HelloParser.CompForContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compFor}.
	 * @param ctx the parse tree
	 */
	void exitCompFor(@NotNull HelloParser.CompForContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull HelloParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void enterParametros_funcion(@NotNull HelloParser.Parametros_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void exitParametros_funcion(@NotNull HelloParser.Parametros_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(@NotNull HelloParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(@NotNull HelloParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(@NotNull HelloParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(@NotNull HelloParser.Inc_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sistand}.
	 * @param ctx the parse tree
	 */
	void enterSistand(@NotNull HelloParser.SistandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sistand}.
	 * @param ctx the parse tree
	 */
	void exitSistand(@NotNull HelloParser.SistandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(@NotNull HelloParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(@NotNull HelloParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compSi2}.
	 * @param ctx the parse tree
	 */
	void enterCompSi2(@NotNull HelloParser.CompSi2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compSi2}.
	 * @param ctx the parse tree
	 */
	void exitCompSi2(@NotNull HelloParser.CompSi2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull HelloParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull HelloParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compCase}.
	 * @param ctx the parse tree
	 */
	void enterCompCase(@NotNull HelloParser.CompCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compCase}.
	 * @param ctx the parse tree
	 */
	void exitCompCase(@NotNull HelloParser.CompCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#opMat}.
	 * @param ctx the parse tree
	 */
	void enterOpMat(@NotNull HelloParser.OpMatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#opMat}.
	 * @param ctx the parse tree
	 */
	void exitOpMat(@NotNull HelloParser.OpMatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(@NotNull HelloParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(@NotNull HelloParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var_declB}.
	 * @param ctx the parse tree
	 */
	void enterVar_declB(@NotNull HelloParser.Var_declBContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var_declB}.
	 * @param ctx the parse tree
	 */
	void exitVar_declB(@NotNull HelloParser.Var_declBContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#seccion}.
	 * @param ctx the parse tree
	 */
	void enterSeccion(@NotNull HelloParser.SeccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#seccion}.
	 * @param ctx the parse tree
	 */
	void exitSeccion(@NotNull HelloParser.SeccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#decl_clase}.
	 * @param ctx the parse tree
	 */
	void enterDecl_clase(@NotNull HelloParser.Decl_claseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#decl_clase}.
	 * @param ctx the parse tree
	 */
	void exitDecl_clase(@NotNull HelloParser.Decl_claseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#encaso}.
	 * @param ctx the parse tree
	 */
	void enterEncaso(@NotNull HelloParser.EncasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#encaso}.
	 * @param ctx the parse tree
	 */
	void exitEncaso(@NotNull HelloParser.EncasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#escribir}.
	 * @param ctx the parse tree
	 */
	void enterEscribir(@NotNull HelloParser.EscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#escribir}.
	 * @param ctx the parse tree
	 */
	void exitEscribir(@NotNull HelloParser.EscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compSi}.
	 * @param ctx the parse tree
	 */
	void enterCompSi(@NotNull HelloParser.CompSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compSi}.
	 * @param ctx the parse tree
	 */
	void exitCompSi(@NotNull HelloParser.CompSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#opMayor}.
	 * @param ctx the parse tree
	 */
	void enterOpMayor(@NotNull HelloParser.OpMayorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#opMayor}.
	 * @param ctx the parse tree
	 */
	void exitOpMayor(@NotNull HelloParser.OpMayorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#tipoDedato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDedato(@NotNull HelloParser.TipoDedatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#tipoDedato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDedato(@NotNull HelloParser.TipoDedatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull HelloParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull HelloParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#termPri}.
	 * @param ctx the parse tree
	 */
	void enterTermPri(@NotNull HelloParser.TermPriContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#termPri}.
	 * @param ctx the parse tree
	 */
	void exitTermPri(@NotNull HelloParser.TermPriContext ctx);
}