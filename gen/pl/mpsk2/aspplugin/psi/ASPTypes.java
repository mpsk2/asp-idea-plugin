/*
 * Copyright 2018 Michał Piotr Stankiewicz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package pl.mpsk2.aspplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import pl.mpsk2.aspplugin.psi.impl.*;

public interface ASPTypes {

  IElementType ADD_CONSTANT_TERM = new ASPElementType("ADD_CONSTANT_TERM");
  IElementType ADD_TERM = new ASPElementType("ADD_TERM");
  IElementType ADD_TERM_CSP = new ASPElementType("ADD_TERM_CSP");
  IElementType AGGREGATE_FUNCTION = new ASPElementType("AGGREGATE_FUNCTION");
  IElementType ALT_BODY_AGGR_ELEM = new ASPElementType("ALT_BODY_AGGR_ELEM");
  IElementType ALT_BODY_AGGR_VEC = new ASPElementType("ALT_BODY_AGGR_VEC");
  IElementType ALT_HEAD_AGGR_ELEM = new ASPElementType("ALT_HEAD_AGGR_ELEM");
  IElementType AND_CONSTANT_TERM = new ASPElementType("AND_CONSTANT_TERM");
  IElementType AND_TERM = new ASPElementType("AND_TERM");
  IElementType ARG_VEC = new ASPElementType("ARG_VEC");
  IElementType ATOM = new ASPElementType("ATOM");
  IElementType BINARY_ARG_VEC = new ASPElementType("BINARY_ARG_VEC");
  IElementType BINARY_ARG_VEC_ELEM = new ASPElementType("BINARY_ARG_VEC_ELEM");
  IElementType BLOCK_STATEMENT = new ASPElementType("BLOCK_STATEMENT");
  IElementType BODY_ = new ASPElementType("BODY_");
  IElementType BODY_AGGREGATE = new ASPElementType("BODY_AGGREGATE");
  IElementType BODY_COND_DOT = new ASPElementType("BODY_COND_DOT");
  IElementType BODY_DOT_ELEM = new ASPElementType("BODY_DOT_ELEM");
  IElementType BODY_DOT_ELEM_2 = new ASPElementType("BODY_DOT_ELEM_2");
  IElementType CONJUNCTION = new ASPElementType("CONJUNCTION");
  IElementType CONSTANT = new ASPElementType("CONSTANT");
  IElementType CONSTANT_TERM = new ASPElementType("CONSTANT_TERM");
  IElementType CONSTANT_TERM_VEC = new ASPElementType("CONSTANT_TERM_VEC");
  IElementType CONST_CONSTANT_TERM = new ASPElementType("CONST_CONSTANT_TERM");
  IElementType CONST_TERM = new ASPElementType("CONST_TERM");
  IElementType CSP_LITERAL = new ASPElementType("CSP_LITERAL");
  IElementType DEFINE = new ASPElementType("DEFINE");
  IElementType DEFINE_STATEMENT = new ASPElementType("DEFINE_STATEMENT");
  IElementType DISJOINT_ = new ASPElementType("DISJOINT_");
  IElementType DISJOINT_STATEMENT = new ASPElementType("DISJOINT_STATEMENT");
  IElementType DISJUNCTION = new ASPElementType("DISJUNCTION");
  IElementType DISJUNCTION_SEP = new ASPElementType("DISJUNCTION_SEP");
  IElementType DOTS_TERM = new ASPElementType("DOTS_TERM");
  IElementType EDGE_STATEMENT = new ASPElementType("EDGE_STATEMENT");
  IElementType EXTERNAL_STATEMENT = new ASPElementType("EXTERNAL_STATEMENT");
  IElementType HEAD_ = new ASPElementType("HEAD_");
  IElementType HEAD_AGGREGATE = new ASPElementType("HEAD_AGGREGATE");
  IElementType HEAD_AGGR_ELEM = new ASPElementType("HEAD_AGGR_ELEM");
  IElementType HEAD_AGGR_VEC = new ASPElementType("HEAD_AGGR_VEC");
  IElementType HEAD_STATEMENT = new ASPElementType("HEAD_STATEMENT");
  IElementType HEURISTIC_STATEMENT = new ASPElementType("HEURISTIC_STATEMENT");
  IElementType IDENTIFIER = new ASPElementType("IDENTIFIER");
  IElementType IDENTIFIER_LIST = new ASPElementType("IDENTIFIER_LIST");
  IElementType ID_CONSTANT_TERM = new ASPElementType("ID_CONSTANT_TERM");
  IElementType ID_TERM = new ASPElementType("ID_TERM");
  IElementType IF_STATEMENT = new ASPElementType("IF_STATEMENT");
  IElementType INCLUDE_STATEMENT = new ASPElementType("INCLUDE_STATEMENT");
  IElementType LITERAL = new ASPElementType("LITERAL");
  IElementType LN_OPT_CONDITION = new ASPElementType("LN_OPT_CONDITION");
  IElementType LUA_CODE_STATEMENT = new ASPElementType("LUA_CODE_STATEMENT");
  IElementType LU_BODY_AGGREGATE = new ASPElementType("LU_BODY_AGGREGATE");
  IElementType LU_HEAD_AGGREGATE = new ASPElementType("LU_HEAD_AGGREGATE");
  IElementType MAXIMIZE_STATEMENT = new ASPElementType("MAXIMIZE_STATEMENT");
  IElementType MAX_MIN_ELEM = new ASPElementType("MAX_MIN_ELEM");
  IElementType MAX_MIN_LIST = new ASPElementType("MAX_MIN_LIST");
  IElementType MINIMIZE_STATEMENT = new ASPElementType("MINIMIZE_STATEMENT");
  IElementType MUL_CONSTANT_TERM = new ASPElementType("MUL_CONSTANT_TERM");
  IElementType MUL_TERM = new ASPElementType("MUL_TERM");
  IElementType MUL_TERM_CSP = new ASPElementType("MUL_TERM_CSP");
  IElementType N_CSP_ELEM = new ASPElementType("N_CSP_ELEM");
  IElementType N_CSP_VEC = new ASPElementType("N_CSP_VEC");
  IElementType N_LIT_VEC = new ASPElementType("N_LIT_VEC");
  IElementType N_OPT_CONDITION = new ASPElementType("N_OPT_CONDITION");
  IElementType N_TERM_VEC = new ASPElementType("N_TERM_VEC");
  IElementType OPTIMIZE_COND = new ASPElementType("OPTIMIZE_COND");
  IElementType OPTIMIZE_LIT_VEC = new ASPElementType("OPTIMIZE_LIT_VEC");
  IElementType OPTIMIZE_TUPLE = new ASPElementType("OPTIMIZE_TUPLE");
  IElementType OPTIMIZE_WEIGHT = new ASPElementType("OPTIMIZE_WEIGHT");
  IElementType OPT_CONDITION = new ASPElementType("OPT_CONDITION");
  IElementType PAREN_CONSTANT_TERM = new ASPElementType("PAREN_CONSTANT_TERM");
  IElementType PAREN_TERM = new ASPElementType("PAREN_TERM");
  IElementType PROGRAM = new ASPElementType("PROGRAM");
  IElementType PROJECT_STATEMENT = new ASPElementType("PROJECT_STATEMENT");
  IElementType PROJECT_STATEMENT_BODY = new ASPElementType("PROJECT_STATEMENT_BODY");
  IElementType PYTHON_CODE_STATEMENT = new ASPElementType("PYTHON_CODE_STATEMENT");
  IElementType QUESTION_CONSTANT_TERM = new ASPElementType("QUESTION_CONSTANT_TERM");
  IElementType QUESTION_TERM = new ASPElementType("QUESTION_TERM");
  IElementType SHOW_SIG_STATEMENT = new ASPElementType("SHOW_SIG_STATEMENT");
  IElementType SHOW_STATEMENT = new ASPElementType("SHOW_STATEMENT");
  IElementType SHOW_STATEMENT_BODY = new ASPElementType("SHOW_STATEMENT_BODY");
  IElementType STATEMENT = new ASPElementType("STATEMENT");
  IElementType TERM = new ASPElementType("TERM");
  IElementType TERM_VEC = new ASPElementType("TERM_VEC");
  IElementType THEORY_STATEMENT = new ASPElementType("THEORY_STATEMENT");
  IElementType UN_NEG_CONSTANT_TERM = new ASPElementType("UN_NEG_CONSTANT_TERM");
  IElementType UN_NEG_TERM = new ASPElementType("UN_NEG_TERM");
  IElementType UN_NOT_CONSTANT_TERM = new ASPElementType("UN_NOT_CONSTANT_TERM");
  IElementType UN_NOT_TERM = new ASPElementType("UN_NOT_TERM");
  IElementType UPPER_ = new ASPElementType("UPPER_");
  IElementType V_BAR_CONSTANT_TERM = new ASPElementType("V_BAR_CONSTANT_TERM");
  IElementType V_BAR_TERM = new ASPElementType("V_BAR_TERM");
  IElementType W_IF_STATEMENT = new ASPElementType("W_IF_STATEMENT");
  IElementType XOR_CONSTANT_TERM = new ASPElementType("XOR_CONSTANT_TERM");
  IElementType XOR_TERM = new ASPElementType("XOR_TERM");

  IElementType ADD = new ASPTokenType("+");
  IElementType AND = new ASPTokenType("&");
  IElementType ANONYMOUS = new ASPTokenType("_");
  IElementType ANY = new ASPTokenType("any");
  IElementType AT = new ASPTokenType("@");
  IElementType BASE = new ASPTokenType("#base");
  IElementType BINARY = new ASPTokenType("binary");
  IElementType BLOCK = new ASPTokenType("#program");
  IElementType BNOT = new ASPTokenType("~");
  IElementType BODY = new ASPTokenType("body");
  IElementType COLON = new ASPTokenType(":");
  IElementType COMMA = new ASPTokenType(",");
  IElementType COMMENT = new ASPTokenType("comment");
  IElementType CONST = new ASPTokenType("#const");
  IElementType COUNT = new ASPTokenType("#count");
  IElementType CSP = new ASPTokenType("$");
  IElementType CSP_ADD = new ASPTokenType("$+");
  IElementType CSP_EQ = new ASPTokenType("$=");
  IElementType CSP_GEQ = new ASPTokenType("$>=");
  IElementType CSP_GT = new ASPTokenType("$>");
  IElementType CSP_LEQ = new ASPTokenType("$<=");
  IElementType CSP_LT = new ASPTokenType("$<");
  IElementType CSP_MUL = new ASPTokenType("$*");
  IElementType CSP_NEQ = new ASPTokenType("$!=");
  IElementType CSP_SUB = new ASPTokenType("$-");
  IElementType CUMULATIVE = new ASPTokenType("#cumulative");
  IElementType DIRECTIVE = new ASPTokenType("directive");
  IElementType DISJOINT = new ASPTokenType("#disjoint");
  IElementType DOT = new ASPTokenType(".");
  IElementType DOTS = new ASPTokenType("..");
  IElementType EDGE = new ASPTokenType("#edge");
  IElementType EQ = new ASPTokenType("=");
  IElementType EXTERNAL = new ASPTokenType("#external");
  IElementType FALSE = new ASPTokenType("#false");
  IElementType FORGET = new ASPTokenType("#forget");
  IElementType GEQ = new ASPTokenType(">=");
  IElementType GT = new ASPTokenType(">");
  IElementType HEAD = new ASPTokenType("head");
  IElementType HEURISTIC = new ASPTokenType("#heuristic");
  IElementType ID = new ASPTokenType("id");
  IElementType IF = new ASPTokenType(":-");
  IElementType INCLUDE = new ASPTokenType("#include");
  IElementType INFIMUM = new ASPTokenType("#inf");
  IElementType LBRACE = new ASPTokenType("{");
  IElementType LBRACK = new ASPTokenType("[");
  IElementType LEFT = new ASPTokenType("left");
  IElementType LEQ = new ASPTokenType("<=");
  IElementType LPAREN = new ASPTokenType("(");
  IElementType LT = new ASPTokenType("<");
  IElementType MAX = new ASPTokenType("#max");
  IElementType MAXIMIZE = new ASPTokenType("#maximize");
  IElementType MIN = new ASPTokenType("#min");
  IElementType MINIMIZE = new ASPTokenType("#minimize");
  IElementType MOD = new ASPTokenType("\\\\");
  IElementType MUL = new ASPTokenType("*");
  IElementType NEQ = new ASPTokenType("!=");
  IElementType NOT = new ASPTokenType("not");
  IElementType NUMBER = new ASPTokenType("number");
  IElementType PARSE_DEF = new ASPTokenType("<define>");
  IElementType PARSE_LP = new ASPTokenType("<program>");
  IElementType POW = new ASPTokenType("**");
  IElementType PROJECT_ = new ASPTokenType("#project");
  IElementType QUESTION = new ASPTokenType("?");
  IElementType RBRACE = new ASPTokenType("}");
  IElementType RBRACK = new ASPTokenType("]");
  IElementType RIGHT = new ASPTokenType("right");
  IElementType RPAREN = new ASPTokenType(")");
  IElementType SEM = new ASPTokenType(";");
  IElementType SHOW = new ASPTokenType("#show");
  IElementType SHOWSIG = new ASPTokenType("#showsig");
  IElementType SLASH = new ASPTokenType("/");
  IElementType STRING = new ASPTokenType("string");
  IElementType SUB = new ASPTokenType("-");
  IElementType SUM = new ASPTokenType("#sum");
  IElementType SUMP = new ASPTokenType("#sum+");
  IElementType SUPREMUM = new ASPTokenType("#sup");
  IElementType TERMVEC_1_0 = new ASPTokenType("TermVec_1_0");
  IElementType THEORY = new ASPTokenType("#theory");
  IElementType TRUE = new ASPTokenType("#true");
  IElementType UNARY = new ASPTokenType("unary");
  IElementType VARIABLE = new ASPTokenType("variable");
  IElementType VBAR = new ASPTokenType("|");
  IElementType VOLATILE = new ASPTokenType("#volatile");
  IElementType WIF = new ASPTokenType(":~");
  IElementType XOR = new ASPTokenType("^");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADD_CONSTANT_TERM) {
        return new ASPAddConstantTermImpl(node);
      }
      else if (type == ADD_TERM) {
        return new ASPAddTermImpl(node);
      }
      else if (type == ADD_TERM_CSP) {
        return new ASPAddTermCspImpl(node);
      }
      else if (type == AGGREGATE_FUNCTION) {
        return new ASPAggregateFunctionImpl(node);
      }
      else if (type == ALT_BODY_AGGR_ELEM) {
        return new ASPAltBodyAggrElemImpl(node);
      }
      else if (type == ALT_BODY_AGGR_VEC) {
        return new ASPAltBodyAggrVecImpl(node);
      }
      else if (type == ALT_HEAD_AGGR_ELEM) {
        return new ASPAltHeadAggrElemImpl(node);
      }
      else if (type == AND_CONSTANT_TERM) {
        return new ASPAndConstantTermImpl(node);
      }
      else if (type == AND_TERM) {
        return new ASPAndTermImpl(node);
      }
      else if (type == ARG_VEC) {
        return new ASPArgVecImpl(node);
      }
      else if (type == ATOM) {
        return new ASPAtomImpl(node);
      }
      else if (type == BINARY_ARG_VEC) {
        return new ASPBinaryArgVecImpl(node);
      }
      else if (type == BINARY_ARG_VEC_ELEM) {
        return new ASPBinaryArgVecElemImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new ASPBlockStatementImpl(node);
      }
      else if (type == BODY_) {
        return new ASPBody_Impl(node);
      }
      else if (type == BODY_AGGREGATE) {
        return new ASPBodyAggregateImpl(node);
      }
      else if (type == BODY_COND_DOT) {
        return new ASPBodyCondDotImpl(node);
      }
      else if (type == BODY_DOT_ELEM) {
        return new ASPBodyDotElemImpl(node);
      }
      else if (type == BODY_DOT_ELEM_2) {
        return new ASPBodyDotElem2Impl(node);
      }
      else if (type == CONJUNCTION) {
        return new ASPConjunctionImpl(node);
      }
      else if (type == CONSTANT) {
        return new ASPConstantImpl(node);
      }
      else if (type == CONSTANT_TERM_VEC) {
        return new ASPConstantTermVecImpl(node);
      }
      else if (type == CONST_CONSTANT_TERM) {
        return new ASPConstConstantTermImpl(node);
      }
      else if (type == CONST_TERM) {
        return new ASPConstTermImpl(node);
      }
      else if (type == CSP_LITERAL) {
        return new ASPCspLiteralImpl(node);
      }
      else if (type == DEFINE) {
        return new ASPDefineImpl(node);
      }
      else if (type == DEFINE_STATEMENT) {
        return new ASPDefineStatementImpl(node);
      }
      else if (type == DISJOINT_) {
        return new ASPDisjoint_Impl(node);
      }
      else if (type == DISJOINT_STATEMENT) {
        return new ASPDisjointStatementImpl(node);
      }
      else if (type == DISJUNCTION) {
        return new ASPDisjunctionImpl(node);
      }
      else if (type == DISJUNCTION_SEP) {
        return new ASPDisjunctionSepImpl(node);
      }
      else if (type == DOTS_TERM) {
        return new ASPDotsTermImpl(node);
      }
      else if (type == EDGE_STATEMENT) {
        return new ASPEdgeStatementImpl(node);
      }
      else if (type == EXTERNAL_STATEMENT) {
        return new ASPExternalStatementImpl(node);
      }
      else if (type == HEAD_) {
        return new ASPHead_Impl(node);
      }
      else if (type == HEAD_AGGREGATE) {
        return new ASPHeadAggregateImpl(node);
      }
      else if (type == HEAD_AGGR_ELEM) {
        return new ASPHeadAggrElemImpl(node);
      }
      else if (type == HEAD_AGGR_VEC) {
        return new ASPHeadAggrVecImpl(node);
      }
      else if (type == HEAD_STATEMENT) {
        return new ASPHeadStatementImpl(node);
      }
      else if (type == HEURISTIC_STATEMENT) {
        return new ASPHeuristicStatementImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new ASPIdentifierImpl(node);
      }
      else if (type == IDENTIFIER_LIST) {
        return new ASPIdentifierListImpl(node);
      }
      else if (type == ID_CONSTANT_TERM) {
        return new ASPIdConstantTermImpl(node);
      }
      else if (type == ID_TERM) {
        return new ASPIdTermImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new ASPIfStatementImpl(node);
      }
      else if (type == INCLUDE_STATEMENT) {
        return new ASPIncludeStatementImpl(node);
      }
      else if (type == LITERAL) {
        return new ASPLiteralImpl(node);
      }
      else if (type == LN_OPT_CONDITION) {
        return new ASPLNOptConditionImpl(node);
      }
      else if (type == LUA_CODE_STATEMENT) {
        return new ASPLuaCodeStatementImpl(node);
      }
      else if (type == LU_BODY_AGGREGATE) {
        return new ASPLuBodyAggregateImpl(node);
      }
      else if (type == LU_HEAD_AGGREGATE) {
        return new ASPLuHeadAggregateImpl(node);
      }
      else if (type == MAXIMIZE_STATEMENT) {
        return new ASPMaximizeStatementImpl(node);
      }
      else if (type == MAX_MIN_ELEM) {
        return new ASPMaxMinElemImpl(node);
      }
      else if (type == MAX_MIN_LIST) {
        return new ASPMaxMinListImpl(node);
      }
      else if (type == MINIMIZE_STATEMENT) {
        return new ASPMinimizeStatementImpl(node);
      }
      else if (type == MUL_CONSTANT_TERM) {
        return new ASPMulConstantTermImpl(node);
      }
      else if (type == MUL_TERM) {
        return new ASPMulTermImpl(node);
      }
      else if (type == MUL_TERM_CSP) {
        return new ASPMulTermCspImpl(node);
      }
      else if (type == N_CSP_ELEM) {
        return new ASPNCspElemImpl(node);
      }
      else if (type == N_CSP_VEC) {
        return new ASPNCspVecImpl(node);
      }
      else if (type == N_LIT_VEC) {
        return new ASPNLitVecImpl(node);
      }
      else if (type == N_OPT_CONDITION) {
        return new ASPNOptConditionImpl(node);
      }
      else if (type == N_TERM_VEC) {
        return new ASPNTermVecImpl(node);
      }
      else if (type == OPTIMIZE_COND) {
        return new ASPOptimizeCondImpl(node);
      }
      else if (type == OPTIMIZE_LIT_VEC) {
        return new ASPOptimizeLitVecImpl(node);
      }
      else if (type == OPTIMIZE_TUPLE) {
        return new ASPOptimizeTupleImpl(node);
      }
      else if (type == OPTIMIZE_WEIGHT) {
        return new ASPOptimizeWeightImpl(node);
      }
      else if (type == OPT_CONDITION) {
        return new ASPOptConditionImpl(node);
      }
      else if (type == PAREN_CONSTANT_TERM) {
        return new ASPParenConstantTermImpl(node);
      }
      else if (type == PAREN_TERM) {
        return new ASPParenTermImpl(node);
      }
      else if (type == PROGRAM) {
        return new ASPProgramImpl(node);
      }
      else if (type == PROJECT_STATEMENT) {
        return new ASPProjectStatementImpl(node);
      }
      else if (type == PROJECT_STATEMENT_BODY) {
        return new ASPProjectStatementBodyImpl(node);
      }
      else if (type == PYTHON_CODE_STATEMENT) {
        return new ASPPythonCodeStatementImpl(node);
      }
      else if (type == QUESTION_CONSTANT_TERM) {
        return new ASPQuestionConstantTermImpl(node);
      }
      else if (type == QUESTION_TERM) {
        return new ASPQuestionTermImpl(node);
      }
      else if (type == SHOW_SIG_STATEMENT) {
        return new ASPShowSigStatementImpl(node);
      }
      else if (type == SHOW_STATEMENT) {
        return new ASPShowStatementImpl(node);
      }
      else if (type == SHOW_STATEMENT_BODY) {
        return new ASPShowStatementBodyImpl(node);
      }
      else if (type == TERM_VEC) {
        return new ASPTermVecImpl(node);
      }
      else if (type == THEORY_STATEMENT) {
        return new ASPTheoryStatementImpl(node);
      }
      else if (type == UN_NEG_CONSTANT_TERM) {
        return new ASPUnNegConstantTermImpl(node);
      }
      else if (type == UN_NEG_TERM) {
        return new ASPUnNegTermImpl(node);
      }
      else if (type == UN_NOT_CONSTANT_TERM) {
        return new ASPUnNotConstantTermImpl(node);
      }
      else if (type == UN_NOT_TERM) {
        return new ASPUnNotTermImpl(node);
      }
      else if (type == UPPER_) {
        return new ASPUpper_Impl(node);
      }
      else if (type == V_BAR_CONSTANT_TERM) {
        return new ASPVBarConstantTermImpl(node);
      }
      else if (type == V_BAR_TERM) {
        return new ASPVBarTermImpl(node);
      }
      else if (type == W_IF_STATEMENT) {
        return new ASPWIfStatementImpl(node);
      }
      else if (type == XOR_CONSTANT_TERM) {
        return new ASPXorConstantTermImpl(node);
      }
      else if (type == XOR_TERM) {
        return new ASPXorTermImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
