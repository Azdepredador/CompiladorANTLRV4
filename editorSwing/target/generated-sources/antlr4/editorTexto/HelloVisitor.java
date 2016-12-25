// Generated from Hello.g4 by ANTLR 4.4

	package editorTexto;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#operadoresComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoresComp(@NotNull HelloParser.OperadoresCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo(@NotNull HelloParser.NoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#regresaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegresaParametros(@NotNull HelloParser.RegresaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull HelloParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(@NotNull HelloParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#lib_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib_const(@NotNull HelloParser.Lib_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#libreria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibreria(@NotNull HelloParser.LibreriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#incremento_decremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento_decremento(@NotNull HelloParser.Incremento_decrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(@NotNull HelloParser.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClase(@NotNull HelloParser.ClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#repite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepite(@NotNull HelloParser.RepiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(@NotNull HelloParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#restriccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriccion(@NotNull HelloParser.RestriccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(@NotNull HelloParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#comparadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparadores(@NotNull HelloParser.ComparadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(@NotNull HelloParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm2(@NotNull HelloParser.Term2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(@NotNull HelloParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(@NotNull HelloParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#llamar_objecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_objecto(@NotNull HelloParser.Llamar_objectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#llamarFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamarFuncion(@NotNull HelloParser.LlamarFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(@NotNull HelloParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull HelloParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(@NotNull HelloParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompFor(@NotNull HelloParser.CompForContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull HelloParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#parametros_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_funcion(@NotNull HelloParser.Parametros_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(@NotNull HelloParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(@NotNull HelloParser.Inc_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sistand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSistand(@NotNull HelloParser.SistandContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(@NotNull HelloParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compSi2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompSi2(@NotNull HelloParser.CompSi2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(@NotNull HelloParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompCase(@NotNull HelloParser.CompCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#opMat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMat(@NotNull HelloParser.OpMatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(@NotNull HelloParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var_declB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declB(@NotNull HelloParser.Var_declBContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#seccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccion(@NotNull HelloParser.SeccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#decl_clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_clase(@NotNull HelloParser.Decl_claseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#encaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncaso(@NotNull HelloParser.EncasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir(@NotNull HelloParser.EscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompSi(@NotNull HelloParser.CompSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#opMayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMayor(@NotNull HelloParser.OpMayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#tipoDedato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDedato(@NotNull HelloParser.TipoDedatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(@NotNull HelloParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#termPri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermPri(@NotNull HelloParser.TermPriContext ctx);
}