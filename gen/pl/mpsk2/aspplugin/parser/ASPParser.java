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
package pl.mpsk2.aspplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static pl.mpsk2.aspplugin.psi.ASPTypes.*;
import static pl.mpsk2.aspplugin.parser.ASPParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ASPParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADD_TERM_CSP) {
      r = AddTermCsp(b, 0);
    }
    else if (t == AGGREGATE_FUNCTION) {
      r = AggregateFunction(b, 0);
    }
    else if (t == ALT_BODY_AGGR_ELEM) {
      r = AltBody_AggrElem(b, 0);
    }
    else if (t == ALT_BODY_AGGR_VEC) {
      r = AltBody_AggrVec(b, 0);
    }
    else if (t == ALT_HEAD_AGGR_ELEM) {
      r = AltHeadAggrElem(b, 0);
    }
    else if (t == ARG_VEC) {
      r = ArgVec(b, 0);
    }
    else if (t == ATOM) {
      r = Atom(b, 0);
    }
    else if (t == BINARY_ARG_VEC) {
      r = BinaryArgVec(b, 0);
    }
    else if (t == BINARY_ARG_VEC_ELEM) {
      r = BinaryArgVecElem(b, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = BlockStatement(b, 0);
    }
    else if (t == BODY_) {
      r = Body_(b, 0);
    }
    else if (t == BODY_AGGREGATE) {
      r = Body_Aggregate(b, 0);
    }
    else if (t == BODY_COND_DOT) {
      r = Body_CondDot(b, 0);
    }
    else if (t == BODY_DOT_ELEM) {
      r = Body_DotElem(b, 0);
    }
    else if (t == BODY_DOT_ELEM_2) {
      r = Body_DotElem2(b, 0);
    }
    else if (t == CONJUNCTION) {
      r = Conjunction(b, 0);
    }
    else if (t == CONSTANT) {
      r = Constant(b, 0);
    }
    else if (t == CONSTANT_TERM) {
      r = ConstantTerm(b, 0, -1);
    }
    else if (t == CONSTANT_TERM_VEC) {
      r = ConstantTermVec(b, 0);
    }
    else if (t == CSP_LITERAL) {
      r = CspLiteral(b, 0);
    }
    else if (t == DEFINE) {
      r = Define(b, 0);
    }
    else if (t == DEFINE_STATEMENT) {
      r = DefineStatement(b, 0);
    }
    else if (t == DISJOINT_STATEMENT) {
      r = DisjointStatement(b, 0);
    }
    else if (t == DISJOINT_) {
      r = Disjoint_(b, 0);
    }
    else if (t == DISJUNCTION) {
      r = Disjunction(b, 0);
    }
    else if (t == DISJUNCTION_SEP) {
      r = DisjunctionSep(b, 0);
    }
    else if (t == EDGE_STATEMENT) {
      r = EdgeStatement(b, 0);
    }
    else if (t == EXTERNAL_STATEMENT) {
      r = ExternalStatement(b, 0);
    }
    else if (t == HEAD_AGGR_ELEM) {
      r = HeadAggrElem(b, 0);
    }
    else if (t == HEAD_AGGR_VEC) {
      r = HeadAggrVec(b, 0);
    }
    else if (t == HEAD_AGGREGATE) {
      r = HeadAggregate(b, 0);
    }
    else if (t == HEAD_STATEMENT) {
      r = HeadStatement(b, 0);
    }
    else if (t == HEAD_) {
      r = Head_(b, 0);
    }
    else if (t == HEURISTIC_STATEMENT) {
      r = HeuristicStatement(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = Identifier(b, 0);
    }
    else if (t == IDENTIFIER_LIST) {
      r = IdentifierList(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == INCLUDE_STATEMENT) {
      r = IncludeStatement(b, 0);
    }
    else if (t == LN_OPT_CONDITION) {
      r = LNOptCondition(b, 0);
    }
    else if (t == LITERAL) {
      r = Literal(b, 0);
    }
    else if (t == LU_BODY_AGGREGATE) {
      r = LuBody_Aggregate(b, 0);
    }
    else if (t == LU_HEAD_AGGREGATE) {
      r = LuHeadAggregate(b, 0);
    }
    else if (t == LUA_CODE_STATEMENT) {
      r = LuaCodeStatement(b, 0);
    }
    else if (t == MAX_MIN_ELEM) {
      r = MaxMinElem(b, 0);
    }
    else if (t == MAX_MIN_LIST) {
      r = MaxMinList(b, 0);
    }
    else if (t == MAXIMIZE_STATEMENT) {
      r = MaximizeStatement(b, 0);
    }
    else if (t == MINIMIZE_STATEMENT) {
      r = MinimizeStatement(b, 0);
    }
    else if (t == MUL_TERM_CSP) {
      r = MulTermCsp(b, 0);
    }
    else if (t == N_CSP_ELEM) {
      r = NCspElem(b, 0);
    }
    else if (t == N_CSP_VEC) {
      r = NCspVec(b, 0);
    }
    else if (t == N_LIT_VEC) {
      r = NLitVec(b, 0);
    }
    else if (t == N_OPT_CONDITION) {
      r = NOptCondition(b, 0);
    }
    else if (t == N_TERM_VEC) {
      r = NTermVec(b, 0);
    }
    else if (t == OPT_CONDITION) {
      r = OptCondition(b, 0);
    }
    else if (t == OPTIMIZE_COND) {
      r = OptimizeCond(b, 0);
    }
    else if (t == OPTIMIZE_LIT_VEC) {
      r = OptimizeLitVec(b, 0);
    }
    else if (t == OPTIMIZE_TUPLE) {
      r = OptimizeTuple(b, 0);
    }
    else if (t == OPTIMIZE_WEIGHT) {
      r = OptimizeWeight(b, 0);
    }
    else if (t == PROGRAM) {
      r = Program(b, 0);
    }
    else if (t == PROJECT_STATEMENT) {
      r = ProjectStatement(b, 0);
    }
    else if (t == PROJECT_STATEMENT_BODY) {
      r = ProjectStatementBody(b, 0);
    }
    else if (t == PYTHON_CODE_STATEMENT) {
      r = PythonCodeStatement(b, 0);
    }
    else if (t == SHOW_SIG_STATEMENT) {
      r = ShowSigStatement(b, 0);
    }
    else if (t == SHOW_STATEMENT) {
      r = ShowStatement(b, 0);
    }
    else if (t == SHOW_STATEMENT_BODY) {
      r = ShowStatementBody(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == TERM) {
      r = Term(b, 0, -1);
    }
    else if (t == TERM_VEC) {
      r = TermVec(b, 0);
    }
    else if (t == THEORY_STATEMENT) {
      r = TheoryStatement(b, 0);
    }
    else if (t == UPPER_) {
      r = Upper_(b, 0);
    }
    else if (t == W_IF_STATEMENT) {
      r = WIfStatement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADD_CONSTANT_TERM, AND_CONSTANT_TERM, CONSTANT_TERM, CONST_CONSTANT_TERM,
      ID_CONSTANT_TERM, MUL_CONSTANT_TERM, PAREN_CONSTANT_TERM, QUESTION_CONSTANT_TERM,
      UN_NEG_CONSTANT_TERM, UN_NOT_CONSTANT_TERM, V_BAR_CONSTANT_TERM, XOR_CONSTANT_TERM),
    create_token_set_(ADD_TERM, AND_TERM, CONST_TERM, DOTS_TERM,
      ID_TERM, MUL_TERM, PAREN_TERM, QUESTION_TERM,
      TERM, UN_NEG_TERM, UN_NOT_TERM, V_BAR_TERM,
      XOR_TERM),
    create_token_set_(BLOCK_STATEMENT, DEFINE_STATEMENT, DISJOINT_STATEMENT, EDGE_STATEMENT,
      EXTERNAL_STATEMENT, HEAD_STATEMENT, HEURISTIC_STATEMENT, IF_STATEMENT,
      INCLUDE_STATEMENT, LUA_CODE_STATEMENT, MAXIMIZE_STATEMENT, MINIMIZE_STATEMENT,
      PROJECT_STATEMENT, PYTHON_CODE_STATEMENT, SHOW_SIG_STATEMENT, SHOW_STATEMENT,
      STATEMENT, THEORY_STATEMENT, W_IF_STATEMENT),
  };

  /* ********************************************************** */
  // ADD | SUB
  static boolean AddOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddOp")) return false;
    if (!nextTokenIs(b, "", ADD, SUB)) return false;
    boolean r;
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    return r;
  }

  /* ********************************************************** */
  // MulTermCsp ((CSP_ADD|CSP_SUB) MulTermCsp)*
  public static boolean AddTermCsp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddTermCsp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD_TERM_CSP, "<add term csp>");
    r = MulTermCsp(b, l + 1);
    r = r && AddTermCsp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((CSP_ADD|CSP_SUB) MulTermCsp)*
  private static boolean AddTermCsp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddTermCsp_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AddTermCsp_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AddTermCsp_1", c)) break;
    }
    return true;
  }

  // (CSP_ADD|CSP_SUB) MulTermCsp
  private static boolean AddTermCsp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddTermCsp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddTermCsp_1_0_0(b, l + 1);
    r = r && MulTermCsp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CSP_ADD|CSP_SUB
  private static boolean AddTermCsp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddTermCsp_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, CSP_ADD);
    if (!r) r = consumeToken(b, CSP_SUB);
    return r;
  }

  /* ********************************************************** */
  // SUM | SUMP | MIN | MAX | COUNT
  public static boolean AggregateFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AggregateFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGGREGATE_FUNCTION, "<aggregate function>");
    r = consumeToken(b, SUM);
    if (!r) r = consumeToken(b, SUMP);
    if (!r) r = consumeToken(b, MIN);
    if (!r) r = consumeToken(b, MAX);
    if (!r) r = consumeToken(b, COUNT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Literal OptCondition
  public static boolean AltBody_AggrElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltBody_AggrElem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALT_BODY_AGGR_ELEM, "<alt body aggr elem>");
    r = Literal(b, l + 1);
    r = r && OptCondition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AltBody_AggrElem (SEM AltBody_AggrVec)*
  public static boolean AltBody_AggrVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltBody_AggrVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALT_BODY_AGGR_VEC, "<alt body aggr vec>");
    r = AltBody_AggrElem(b, l + 1);
    r = r && AltBody_AggrVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SEM AltBody_AggrVec)*
  private static boolean AltBody_AggrVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltBody_AggrVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AltBody_AggrVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AltBody_AggrVec_1", c)) break;
    }
    return true;
  }

  // SEM AltBody_AggrVec
  private static boolean AltBody_AggrVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltBody_AggrVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEM);
    r = r && AltBody_AggrVec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Literal OptCondition
  public static boolean AltHeadAggrElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltHeadAggrElem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALT_HEAD_AGGR_ELEM, "<alt head aggr elem>");
    r = Literal(b, l + 1);
    r = r && OptCondition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AND
  static boolean AndOp(PsiBuilder b, int l) {
    return consumeToken(b, AND);
  }

  /* ********************************************************** */
  // TermVec (SEM TermVec)*
  public static boolean ArgVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG_VEC, "<arg vec>");
    r = TermVec(b, l + 1);
    r = r && ArgVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SEM TermVec)*
  private static boolean ArgVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ArgVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArgVec_1", c)) break;
    }
    return true;
  }

  // SEM TermVec
  private static boolean ArgVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEM);
    r = r && TermVec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SUB? Identifier !CspAnyOp (LPAREN ArgVec RPAREN)?
  public static boolean Atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atom")) return false;
    if (!nextTokenIs(b, "<atom>", SUB, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = Atom_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && Atom_2(b, l + 1);
    r = r && Atom_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SUB?
  private static boolean Atom_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atom_0")) return false;
    consumeToken(b, SUB);
    return true;
  }

  // !CspAnyOp
  private static boolean Atom_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atom_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !CspAnyOp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LPAREN ArgVec RPAREN)?
  private static boolean Atom_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atom_3")) return false;
    Atom_3_0(b, l + 1);
    return true;
  }

  // LPAREN ArgVec RPAREN
  private static boolean Atom_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atom_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ArgVec(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BinaryArgVecElem (SEM BinaryArgVecElem)*
  public static boolean BinaryArgVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryArgVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_ARG_VEC, "<binary arg vec>");
    r = BinaryArgVecElem(b, l + 1);
    r = r && BinaryArgVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SEM BinaryArgVecElem)*
  private static boolean BinaryArgVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryArgVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BinaryArgVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryArgVec_1", c)) break;
    }
    return true;
  }

  // SEM BinaryArgVecElem
  private static boolean BinaryArgVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryArgVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEM);
    r = r && BinaryArgVecElem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Term COMMA Term
  public static boolean BinaryArgVecElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryArgVecElem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_ARG_VEC_ELEM, "<binary arg vec elem>");
    r = Term(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BLOCK Identifier (LPAREN IdentifierList? RPAREN)? DOT
  public static boolean BlockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement")) return false;
    if (!nextTokenIs(b, BLOCK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT, null);
    r = consumeToken(b, BLOCK);
    p = r; // pin = 1
    r = r && report_error_(b, Identifier(b, l + 1));
    r = p && report_error_(b, BlockStatement_2(b, l + 1)) && r;
    r = p && consumeToken(b, DOT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LPAREN IdentifierList? RPAREN)?
  private static boolean BlockStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement_2")) return false;
    BlockStatement_2_0(b, l + 1);
    return true;
  }

  // LPAREN IdentifierList? RPAREN
  private static boolean BlockStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && BlockStatement_2_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // IdentifierList?
  private static boolean BlockStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement_2_0_1")) return false;
    IdentifierList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Body_DotElem ((COMMA|SEM) Body_DotElem|SEM Body_DotElem2)*
  public static boolean Body_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY_, "<body>");
    r = Body_DotElem(b, l + 1);
    r = r && Body__1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((COMMA|SEM) Body_DotElem|SEM Body_DotElem2)*
  private static boolean Body__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body__1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Body__1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Body__1", c)) break;
    }
    return true;
  }

  // (COMMA|SEM) Body_DotElem|SEM Body_DotElem2
  private static boolean Body__1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body__1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Body__1_0_0(b, l + 1);
    if (!r) r = Body__1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA|SEM) Body_DotElem
  private static boolean Body__1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body__1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Body__1_0_0_0(b, l + 1);
    r = r && Body_DotElem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA|SEM
  private static boolean Body__1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body__1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEM);
    return r;
  }

  // SEM Body_DotElem2
  private static boolean Body__1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body__1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEM);
    r = r && Body_DotElem2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AggregateFunction? LBRACE AltBody_AggrVec? RBRACE
  public static boolean Body_Aggregate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_Aggregate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY_AGGREGATE, "<body aggregate>");
    r = Body_Aggregate_0(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && Body_Aggregate_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AggregateFunction?
  private static boolean Body_Aggregate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_Aggregate_0")) return false;
    AggregateFunction(b, l + 1);
    return true;
  }

  // AltBody_AggrVec?
  private static boolean Body_Aggregate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_Aggregate_2")) return false;
    AltBody_AggrVec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON? DOT | COLON Body_ DOT
  public static boolean Body_CondDot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_CondDot")) return false;
    if (!nextTokenIs(b, "<body cond dot>", COLON, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY_COND_DOT, "<body cond dot>");
    r = Body_CondDot_0(b, l + 1);
    if (!r) r = Body_CondDot_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COLON? DOT
  private static boolean Body_CondDot_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_CondDot_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Body_CondDot_0_0(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON?
  private static boolean Body_CondDot_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_CondDot_0_0")) return false;
    consumeToken(b, COLON);
    return true;
  }

  // COLON Body_ DOT
  private static boolean Body_CondDot_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_CondDot_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Body_(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NOT NOT LuBody_Aggregate
  //     |     NOT LuBody_Aggregate
  //     |         LuBody_Aggregate
  //     | Literal
  public static boolean Body_DotElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_DotElem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY_DOT_ELEM, "<body dot elem>");
    r = Body_DotElem_0(b, l + 1);
    if (!r) r = Body_DotElem_1(b, l + 1);
    if (!r) r = LuBody_Aggregate(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NOT NOT LuBody_Aggregate
  private static boolean Body_DotElem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_DotElem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, NOT);
    r = r && LuBody_Aggregate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT LuBody_Aggregate
  private static boolean Body_DotElem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_DotElem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && LuBody_Aggregate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Disjoint_ | Conjunction
  public static boolean Body_DotElem2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Body_DotElem2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY_DOT_ELEM_2, "<body dot elem 2>");
    r = Disjoint_(b, l + 1);
    if (!r) r = Conjunction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EQ | NEQ | GT | GEQ | LT | LEQ
  static boolean CmpOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CmpOp")) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NEQ);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, GEQ);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, LEQ);
    return r;
  }

  /* ********************************************************** */
  // Literal COLON NLitVec
  public static boolean Conjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONJUNCTION, "<conjunction>");
    r = Literal(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && NLitVec(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INFIMUM | SUPREMUM | string | number | Identifier
  public static boolean Constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = consumeToken(b, INFIMUM);
    if (!r) r = consumeToken(b, SUPREMUM);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ConstantTerm (COMMA ConstantTerm)*
  public static boolean ConstantTermVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantTermVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_TERM_VEC, "<constant term vec>");
    r = ConstantTerm(b, l + 1, -1);
    r = r && ConstantTermVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA ConstantTerm)*
  private static boolean ConstantTermVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantTermVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConstantTermVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConstantTermVec_1", c)) break;
    }
    return true;
  }

  // COMMA ConstantTerm
  private static boolean ConstantTermVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantTermVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ConstantTerm(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CspRelOp | CSP | CSP_ADD | CSP_MUL | CSP_SUB
  static boolean CspAnyOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CspAnyOp")) return false;
    boolean r;
    r = CspRelOp(b, l + 1);
    if (!r) r = consumeToken(b, CSP);
    if (!r) r = consumeToken(b, CSP_ADD);
    if (!r) r = consumeToken(b, CSP_MUL);
    if (!r) r = consumeToken(b, CSP_SUB);
    return r;
  }

  /* ********************************************************** */
  // AddTermCsp (CspRelOp CspLiteral)*
  public static boolean CspLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CspLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CSP_LITERAL, "<csp literal>");
    r = AddTermCsp(b, l + 1);
    r = r && CspLiteral_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (CspRelOp CspLiteral)*
  private static boolean CspLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CspLiteral_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CspLiteral_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CspLiteral_1", c)) break;
    }
    return true;
  }

  // CspRelOp CspLiteral
  private static boolean CspLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CspLiteral_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CspRelOp(b, l + 1);
    r = r && CspLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CSP_GT | CSP_LT | CSP_GEQ | CSP_LEQ | CSP_EQ | CSP_NEQ
  static boolean CspRelOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CspRelOp")) return false;
    boolean r;
    r = consumeToken(b, CSP_GT);
    if (!r) r = consumeToken(b, CSP_LT);
    if (!r) r = consumeToken(b, CSP_GEQ);
    if (!r) r = consumeToken(b, CSP_LEQ);
    if (!r) r = consumeToken(b, CSP_EQ);
    if (!r) r = consumeToken(b, CSP_NEQ);
    return r;
  }

  /* ********************************************************** */
  // SEM | VBAR
  static boolean DSymOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DSymOp")) return false;
    if (!nextTokenIs(b, "", SEM, VBAR)) return false;
    boolean r;
    r = consumeToken(b, SEM);
    if (!r) r = consumeToken(b, VBAR);
    return r;
  }

  /* ********************************************************** */
  // Identifier EQ ConstantTerm
  public static boolean Define(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Define")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && ConstantTerm(b, l + 1, -1);
    exit_section_(b, m, DEFINE, r);
    return r;
  }

  /* ********************************************************** */
  // CONST Identifier EQ ConstantTerm DOT
  public static boolean DefineStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefineStatement")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFINE_STATEMENT, null);
    r = consumeToken(b, CONST);
    p = r; // pin = 1
    r = r && report_error_(b, Identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, EQ)) && r;
    r = p && report_error_(b, ConstantTerm(b, l + 1, -1)) && r;
    r = p && consumeToken(b, DOT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Disjoint_ IF Body_? DOT
  //     | Disjoint_ DOT
  public static boolean DisjointStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisjointStatement")) return false;
    if (!nextTokenIs(b, "<disjoint statement>", DISJOINT, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJOINT_STATEMENT, "<disjoint statement>");
    r = DisjointStatement_0(b, l + 1);
    if (!r) r = DisjointStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Disjoint_ IF Body_? DOT
  private static boolean DisjointStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisjointStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Disjoint_(b, l + 1);
    r = r && consumeToken(b, IF);
    r = r && DisjointStatement_0_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // Body_?
  private static boolean DisjointStatement_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisjointStatement_0_2")) return false;
    Body_(b, l + 1);
    return true;
  }

  // Disjoint_ DOT
  private static boolean DisjointStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisjointStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Disjoint_(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NOT NOT DISJOINT LBRACE NCspVec? RBRACE
  //     |     NOT DISJOINT LBRACE NCspVec? RBRACE
  //     |         DISJOINT LBRACE NCspVec? RBRACE
  public static boolean Disjoint_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjoint_")) return false;
    if (!nextTokenIs(b, "<disjoint>", DISJOINT, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJOINT_, "<disjoint>");
    r = Disjoint__0(b, l + 1);
    if (!r) r = Disjoint__1(b, l + 1);
    if (!r) r = Disjoint__2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NOT NOT DISJOINT LBRACE NCspVec? RBRACE
  private static boolean Disjoint__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjoint__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, NOT, DISJOINT, LBRACE);
    r = r && Disjoint__0_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NCspVec?
  private static boolean Disjoint__0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjoint__0_4")) return false;
    NCspVec(b, l + 1);
    return true;
  }

  // NOT DISJOINT LBRACE NCspVec? RBRACE
  private static boolean Disjoint__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjoint__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, DISJOINT, LBRACE);
    r = r && Disjoint__1_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NCspVec?
  private static boolean Disjoint__1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjoint__1_3")) return false;
    NCspVec(b, l + 1);
    return true;
  }

  // DISJOINT LBRACE NCspVec? RBRACE
  private static boolean Disjoint__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjoint__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DISJOINT, LBRACE);
    r = r && Disjoint__2_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NCspVec?
  private static boolean Disjoint__2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjoint__2_2")) return false;
    NCspVec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Literal (COMMA|DSymOp) DisjunctionSep* LNOptCondition
  //     | Literal COLON NLitVec (DSymOp DisjunctionSep* LNOptCondition)?
  public static boolean Disjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJUNCTION, "<disjunction>");
    r = Disjunction_0(b, l + 1);
    if (!r) r = Disjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Literal (COMMA|DSymOp) DisjunctionSep* LNOptCondition
  private static boolean Disjunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjunction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Literal(b, l + 1);
    r = r && Disjunction_0_1(b, l + 1);
    r = r && Disjunction_0_2(b, l + 1);
    r = r && LNOptCondition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA|DSymOp
  private static boolean Disjunction_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjunction_0_1")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = DSymOp(b, l + 1);
    return r;
  }

  // DisjunctionSep*
  private static boolean Disjunction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjunction_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DisjunctionSep(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Disjunction_0_2", c)) break;
    }
    return true;
  }

  // Literal COLON NLitVec (DSymOp DisjunctionSep* LNOptCondition)?
  private static boolean Disjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjunction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Literal(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && NLitVec(b, l + 1);
    r = r && Disjunction_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DSymOp DisjunctionSep* LNOptCondition)?
  private static boolean Disjunction_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjunction_1_3")) return false;
    Disjunction_1_3_0(b, l + 1);
    return true;
  }

  // DSymOp DisjunctionSep* LNOptCondition
  private static boolean Disjunction_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjunction_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DSymOp(b, l + 1);
    r = r && Disjunction_1_3_0_1(b, l + 1);
    r = r && LNOptCondition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DisjunctionSep*
  private static boolean Disjunction_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Disjunction_1_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DisjunctionSep(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Disjunction_1_3_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Literal COMMA | LNOptCondition DSymOp
  public static boolean DisjunctionSep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisjunctionSep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJUNCTION_SEP, "<disjunction sep>");
    r = DisjunctionSep_0(b, l + 1);
    if (!r) r = DisjunctionSep_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Literal COMMA
  private static boolean DisjunctionSep_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisjunctionSep_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Literal(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // LNOptCondition DSymOp
  private static boolean DisjunctionSep_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisjunctionSep_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LNOptCondition(b, l + 1);
    r = r && DSymOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOTS
  static boolean DotsOp(PsiBuilder b, int l) {
    return consumeToken(b, DOTS);
  }

  /* ********************************************************** */
  // EDGE LPAREN BinaryArgVec RPAREN Body_CondDot
  public static boolean EdgeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EdgeStatement")) return false;
    if (!nextTokenIs(b, EDGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EDGE_STATEMENT, null);
    r = consumeTokens(b, 1, EDGE, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, BinaryArgVec(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && Body_CondDot(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // EXTERNAL Atom COLON Body_ DOT
  //     | EXTERNAL Atom COLON? DOT
  public static boolean ExternalStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalStatement")) return false;
    if (!nextTokenIs(b, EXTERNAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExternalStatement_0(b, l + 1);
    if (!r) r = ExternalStatement_1(b, l + 1);
    exit_section_(b, m, EXTERNAL_STATEMENT, r);
    return r;
  }

  // EXTERNAL Atom COLON Body_ DOT
  private static boolean ExternalStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTERNAL);
    r = r && Atom(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Body_(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // EXTERNAL Atom COLON? DOT
  private static boolean ExternalStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTERNAL);
    r = r && Atom(b, l + 1);
    r = r && ExternalStatement_1_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON?
  private static boolean ExternalStatement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalStatement_1_2")) return false;
    consumeToken(b, COLON);
    return true;
  }

  /* ********************************************************** */
  // TermVec COLON AltHeadAggrElem
  public static boolean HeadAggrElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadAggrElem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEAD_AGGR_ELEM, "<head aggr elem>");
    r = TermVec(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && AltHeadAggrElem(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // HeadAggrElem (SEM HeadAggrElem)*
  public static boolean HeadAggrVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadAggrVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEAD_AGGR_VEC, "<head aggr vec>");
    r = HeadAggrElem(b, l + 1);
    r = r && HeadAggrVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SEM HeadAggrElem)*
  private static boolean HeadAggrVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadAggrVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!HeadAggrVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HeadAggrVec_1", c)) break;
    }
    return true;
  }

  // SEM HeadAggrElem
  private static boolean HeadAggrVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadAggrVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEM);
    r = r && HeadAggrElem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AggregateFunction? LBRACE HeadAggrVec? RBRACE
  public static boolean HeadAggregate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadAggregate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEAD_AGGREGATE, "<head aggregate>");
    r = HeadAggregate_0(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && HeadAggregate_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AggregateFunction?
  private static boolean HeadAggregate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadAggregate_0")) return false;
    AggregateFunction(b, l + 1);
    return true;
  }

  // HeadAggrVec?
  private static boolean HeadAggregate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadAggregate_2")) return false;
    HeadAggrVec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Head_ DOT
  //     | Head_ IF Body_? DOT
  public static boolean HeadStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEAD_STATEMENT, "<head statement>");
    r = HeadStatement_0(b, l + 1);
    if (!r) r = HeadStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Head_ DOT
  private static boolean HeadStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Head_(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // Head_ IF Body_? DOT
  private static boolean HeadStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Head_(b, l + 1);
    r = r && consumeToken(b, IF);
    r = r && HeadStatement_1_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // Body_?
  private static boolean HeadStatement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeadStatement_1_2")) return false;
    Body_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Disjunction
  //     | LuHeadAggregate
  //     | Literal
  public static boolean Head_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Head_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEAD_, "<head>");
    r = Disjunction(b, l + 1);
    if (!r) r = LuHeadAggregate(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // HEURISTIC Atom Body_CondDot LBRACK Term (AT Term)? COMMA Term RBRACK
  public static boolean HeuristicStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeuristicStatement")) return false;
    if (!nextTokenIs(b, HEURISTIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HEURISTIC_STATEMENT, null);
    r = consumeToken(b, HEURISTIC);
    p = r; // pin = 1
    r = r && report_error_(b, Atom(b, l + 1));
    r = p && report_error_(b, Body_CondDot(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LBRACK)) && r;
    r = p && report_error_(b, Term(b, l + 1, -1)) && r;
    r = p && report_error_(b, HeuristicStatement_5(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, COMMA)) && r;
    r = p && report_error_(b, Term(b, l + 1, -1)) && r;
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (AT Term)?
  private static boolean HeuristicStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeuristicStatement_5")) return false;
    HeuristicStatement_5_0(b, l + 1);
    return true;
  }

  // AT Term
  private static boolean HeuristicStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeuristicStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier (COMMA Identifier)*
  public static boolean IdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && IdentifierList_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // (COMMA Identifier)*
  private static boolean IdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IdentifierList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IdentifierList_1", c)) break;
    }
    return true;
  }

  // COMMA Identifier
  private static boolean IdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IF Body_? DOT
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, null);
    r = consumeToken(b, IF);
    p = r; // pin = 1
    r = r && report_error_(b, IfStatement_1(b, l + 1));
    r = p && consumeToken(b, DOT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Body_?
  private static boolean IfStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_1")) return false;
    Body_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // INCLUDE (string|LT Identifier GT) DOT
  public static boolean IncludeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeStatement")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_STATEMENT, null);
    r = consumeToken(b, INCLUDE);
    p = r; // pin = 1
    r = r && report_error_(b, IncludeStatement_1(b, l + 1));
    r = p && consumeToken(b, DOT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // string|LT Identifier GT
  private static boolean IncludeStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = IncludeStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LT Identifier GT
  private static boolean IncludeStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Literal NOptCondition
  public static boolean LNOptCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LNOptCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LN_OPT_CONDITION, "<ln opt condition>");
    r = Literal(b, l + 1);
    r = r && NOptCondition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NOT NOT TRUE
  //     |     NOT TRUE
  //     |         TRUE
  //     | NOT NOT FALSE
  //     |     NOT FALSE
  //     |         FALSE
  //     | NOT NOT Term CmpOp Term
  //     |     NOT Term CmpOp Term
  //     |         Term CmpOp Term
  //     | NOT NOT Atom
  //     |     NOT Atom
  //     |         Atom
  //     | CspLiteral
  public static boolean Literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = parseTokens(b, 0, NOT, NOT, TRUE);
    if (!r) r = parseTokens(b, 0, NOT, TRUE);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = parseTokens(b, 0, NOT, NOT, FALSE);
    if (!r) r = parseTokens(b, 0, NOT, FALSE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = Literal_6(b, l + 1);
    if (!r) r = Literal_7(b, l + 1);
    if (!r) r = Literal_8(b, l + 1);
    if (!r) r = Literal_9(b, l + 1);
    if (!r) r = Literal_10(b, l + 1);
    if (!r) r = Atom(b, l + 1);
    if (!r) r = CspLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NOT NOT Term CmpOp Term
  private static boolean Literal_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, NOT);
    r = r && Term(b, l + 1, -1);
    r = r && CmpOp(b, l + 1);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT Term CmpOp Term
  private static boolean Literal_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && Term(b, l + 1, -1);
    r = r && CmpOp(b, l + 1);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Term CmpOp Term
  private static boolean Literal_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term(b, l + 1, -1);
    r = r && CmpOp(b, l + 1);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT NOT Atom
  private static boolean Literal_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, NOT);
    r = r && Atom(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT Atom
  private static boolean Literal_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && Atom(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Term CmpOp? Body_Aggregate Upper_?
  public static boolean LuBody_Aggregate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuBody_Aggregate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LU_BODY_AGGREGATE, "<lu body aggregate>");
    r = Term(b, l + 1, -1);
    r = r && LuBody_Aggregate_1(b, l + 1);
    r = r && Body_Aggregate(b, l + 1);
    r = r && LuBody_Aggregate_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CmpOp?
  private static boolean LuBody_Aggregate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuBody_Aggregate_1")) return false;
    CmpOp(b, l + 1);
    return true;
  }

  // Upper_?
  private static boolean LuBody_Aggregate_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuBody_Aggregate_3")) return false;
    Upper_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (Term CmpOp?)? HeadAggregate Upper_?
  public static boolean LuHeadAggregate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuHeadAggregate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LU_HEAD_AGGREGATE, "<lu head aggregate>");
    r = LuHeadAggregate_0(b, l + 1);
    r = r && HeadAggregate(b, l + 1);
    r = r && LuHeadAggregate_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Term CmpOp?)?
  private static boolean LuHeadAggregate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuHeadAggregate_0")) return false;
    LuHeadAggregate_0_0(b, l + 1);
    return true;
  }

  // Term CmpOp?
  private static boolean LuHeadAggregate_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuHeadAggregate_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term(b, l + 1, -1);
    r = r && LuHeadAggregate_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CmpOp?
  private static boolean LuHeadAggregate_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuHeadAggregate_0_0_1")) return false;
    CmpOp(b, l + 1);
    return true;
  }

  // Upper_?
  private static boolean LuHeadAggregate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuHeadAggregate_2")) return false;
    Upper_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "todo lua code statement"
  public static boolean LuaCodeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LuaCodeStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LUA_CODE_STATEMENT, "<lua code statement>");
    r = consumeToken(b, "todo lua code statement");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OptimizeWeight OptimizeCond
  public static boolean MaxMinElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxMinElem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAX_MIN_ELEM, "<max min elem>");
    r = OptimizeWeight(b, l + 1);
    r = r && OptimizeCond(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MaxMinElem (SEM MaxMinElem)*
  public static boolean MaxMinList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxMinList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAX_MIN_LIST, "<max min list>");
    r = MaxMinElem(b, l + 1);
    r = r && MaxMinList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SEM MaxMinElem)*
  private static boolean MaxMinList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxMinList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaxMinList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MaxMinList_1", c)) break;
    }
    return true;
  }

  // SEM MaxMinElem
  private static boolean MaxMinList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxMinList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEM);
    r = r && MaxMinElem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAXIMIZE LBRACE MaxMinList? RBRACE DOT
  public static boolean MaximizeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaximizeStatement")) return false;
    if (!nextTokenIs(b, MAXIMIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAXIMIZE_STATEMENT, null);
    r = consumeTokens(b, 1, MAXIMIZE, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, MaximizeStatement_2(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RBRACE, DOT)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MaxMinList?
  private static boolean MaximizeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaximizeStatement_2")) return false;
    MaxMinList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MINIMIZE LBRACE MaxMinList? RBRACE DOT
  public static boolean MinimizeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinimizeStatement")) return false;
    if (!nextTokenIs(b, MINIMIZE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MINIMIZE_STATEMENT, null);
    r = consumeTokens(b, 1, MINIMIZE, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, MinimizeStatement_2(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RBRACE, DOT)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MaxMinList?
  private static boolean MinimizeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MinimizeStatement_2")) return false;
    MaxMinList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MUL | MOD
  static boolean MulOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulOp")) return false;
    if (!nextTokenIs(b, "", MOD, MUL)) return false;
    boolean r;
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, MOD);
    return r;
  }

  /* ********************************************************** */
  // CSP Term CSP_MUL Term
  //     | Term CSP_MUL CSP Term
  //     | CSP? Term
  public static boolean MulTermCsp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulTermCsp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MUL_TERM_CSP, "<mul term csp>");
    r = MulTermCsp_0(b, l + 1);
    if (!r) r = MulTermCsp_1(b, l + 1);
    if (!r) r = MulTermCsp_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CSP Term CSP_MUL Term
  private static boolean MulTermCsp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulTermCsp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CSP);
    r = r && Term(b, l + 1, -1);
    r = r && consumeToken(b, CSP_MUL);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Term CSP_MUL CSP Term
  private static boolean MulTermCsp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulTermCsp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term(b, l + 1, -1);
    r = r && consumeTokens(b, 0, CSP_MUL, CSP);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CSP? Term
  private static boolean MulTermCsp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulTermCsp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MulTermCsp_2_0(b, l + 1);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CSP?
  private static boolean MulTermCsp_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulTermCsp_2_0")) return false;
    consumeToken(b, CSP);
    return true;
  }

  /* ********************************************************** */
  // TermVec COLON AddTermCsp OptCondition
  public static boolean NCspElem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NCspElem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, N_CSP_ELEM, "<n csp elem>");
    r = TermVec(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && AddTermCsp(b, l + 1);
    r = r && OptCondition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NCspElem (SEM NCspElem)*
  public static boolean NCspVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NCspVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, N_CSP_VEC, "<n csp vec>");
    r = NCspElem(b, l + 1);
    r = r && NCspVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SEM NCspElem)*
  private static boolean NCspVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NCspVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NCspVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NCspVec_1", c)) break;
    }
    return true;
  }

  // SEM NCspElem
  private static boolean NCspVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NCspVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEM);
    r = r && NCspElem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Literal (COMMA Literal)*
  public static boolean NLitVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NLitVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, N_LIT_VEC, "<n lit vec>");
    r = Literal(b, l + 1);
    r = r && NLitVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA Literal)*
  private static boolean NLitVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NLitVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NLitVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NLitVec_1", c)) break;
    }
    return true;
  }

  // COMMA Literal
  private static boolean NLitVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NLitVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COLON NLitVec)?
  public static boolean NOptCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOptCondition")) return false;
    Marker m = enter_section_(b, l, _NONE_, N_OPT_CONDITION, "<n opt condition>");
    NOptCondition_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // COLON NLitVec
  private static boolean NOptCondition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOptCondition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && NLitVec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Term (COMMA Term)*
  public static boolean NTermVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NTermVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, N_TERM_VEC, "<n term vec>");
    r = Term(b, l + 1, -1);
    r = r && NTermVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA Term)*
  private static boolean NTermVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NTermVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NTermVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NTermVec_1", c)) break;
    }
    return true;
  }

  // COMMA Term
  private static boolean NTermVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NTermVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COLON NLitVec?)?
  public static boolean OptCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptCondition")) return false;
    Marker m = enter_section_(b, l, _NONE_, OPT_CONDITION, "<opt condition>");
    OptCondition_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // COLON NLitVec?
  private static boolean OptCondition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptCondition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && OptCondition_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NLitVec?
  private static boolean OptCondition_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptCondition_0_1")) return false;
    NLitVec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON OptimizeLitVec?
  public static boolean OptimizeCond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptimizeCond")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && OptimizeCond_1(b, l + 1);
    exit_section_(b, m, OPTIMIZE_COND, r);
    return r;
  }

  // OptimizeLitVec?
  private static boolean OptimizeCond_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptimizeCond_1")) return false;
    OptimizeLitVec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NLitVec
  public static boolean OptimizeLitVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptimizeLitVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPTIMIZE_LIT_VEC, "<optimize lit vec>");
    r = NLitVec(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMA NTermVec
  public static boolean OptimizeTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptimizeTuple")) return false;
    if (!nextTokenIs(b, COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && NTermVec(b, l + 1);
    exit_section_(b, m, OPTIMIZE_TUPLE, r);
    return r;
  }

  /* ********************************************************** */
  // Term (AT NTermVec)?
  public static boolean OptimizeWeight(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptimizeWeight")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPTIMIZE_WEIGHT, "<optimize weight>");
    r = Term(b, l + 1, -1);
    r = r && OptimizeWeight_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (AT NTermVec)?
  private static boolean OptimizeWeight_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptimizeWeight_1")) return false;
    OptimizeWeight_1_0(b, l + 1);
    return true;
  }

  // AT NTermVec
  private static boolean OptimizeWeight_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptimizeWeight_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && NTermVec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Statement+
  public static boolean Program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM, "<program>");
    r = Statement(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Program", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PROJECT_ ProjectStatementBody
  public static boolean ProjectStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProjectStatement")) return false;
    if (!nextTokenIs(b, PROJECT_)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PROJECT_STATEMENT, null);
    r = consumeToken(b, PROJECT_);
    p = r; // pin = 1
    r = r && ProjectStatementBody(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Atom Body_CondDot | SUB? Identifier SLASH number DOT
  public static boolean ProjectStatementBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProjectStatementBody")) return false;
    if (!nextTokenIs(b, "<project statement body>", SUB, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROJECT_STATEMENT_BODY, "<project statement body>");
    r = ProjectStatementBody_0(b, l + 1);
    if (!r) r = ProjectStatementBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Atom Body_CondDot
  private static boolean ProjectStatementBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProjectStatementBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Atom(b, l + 1);
    r = r && Body_CondDot(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SUB? Identifier SLASH number DOT
  private static boolean ProjectStatementBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProjectStatementBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProjectStatementBody_1_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeTokens(b, 0, SLASH, NUMBER, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // SUB?
  private static boolean ProjectStatementBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProjectStatementBody_1_0")) return false;
    consumeToken(b, SUB);
    return true;
  }

  /* ********************************************************** */
  // "todo python code statement"
  public static boolean PythonCodeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PythonCodeStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PYTHON_CODE_STATEMENT, "<python code statement>");
    r = consumeToken(b, "todo python code statement");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QUESTION
  static boolean QuestionOp(PsiBuilder b, int l) {
    return consumeToken(b, QUESTION);
  }

  /* ********************************************************** */
  // Program | Define
  static boolean RootItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootItem")) return false;
    boolean r;
    r = Program(b, l + 1);
    if (!r) r = Define(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SHOWSIG (SUB|CSP)? Identifier SLASH number DOT
  public static boolean ShowSigStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowSigStatement")) return false;
    if (!nextTokenIs(b, SHOWSIG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SHOW_SIG_STATEMENT, null);
    r = consumeToken(b, SHOWSIG);
    p = r; // pin = 1
    r = r && report_error_(b, ShowSigStatement_1(b, l + 1));
    r = p && report_error_(b, Identifier(b, l + 1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, SLASH, NUMBER, DOT)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (SUB|CSP)?
  private static boolean ShowSigStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowSigStatement_1")) return false;
    ShowSigStatement_1_0(b, l + 1);
    return true;
  }

  // SUB|CSP
  private static boolean ShowSigStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowSigStatement_1_0")) return false;
    boolean r;
    r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, CSP);
    return r;
  }

  /* ********************************************************** */
  // SHOW ShowStatementBody
  public static boolean ShowStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowStatement")) return false;
    if (!nextTokenIs(b, SHOW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SHOW_STATEMENT, null);
    r = consumeToken(b, SHOW);
    p = r; // pin = 1
    r = r && ShowStatementBody(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DOT | CSP? Term (COLON Body_)? DOT
  public static boolean ShowStatementBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowStatementBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHOW_STATEMENT_BODY, "<show statement body>");
    r = consumeToken(b, DOT);
    if (!r) r = ShowStatementBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CSP? Term (COLON Body_)? DOT
  private static boolean ShowStatementBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowStatementBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShowStatementBody_1_0(b, l + 1);
    r = r && Term(b, l + 1, -1);
    r = r && ShowStatementBody_1_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // CSP?
  private static boolean ShowStatementBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowStatementBody_1_0")) return false;
    consumeToken(b, CSP);
    return true;
  }

  // (COLON Body_)?
  private static boolean ShowStatementBody_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowStatementBody_1_2")) return false;
    ShowStatementBody_1_2_0(b, l + 1);
    return true;
  }

  // COLON Body_
  private static boolean ShowStatementBody_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShowStatementBody_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Body_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // HeadStatement
  //     | IfStatement
  //     | DisjointStatement
  //     | WIfStatement
  //     | MinimizeStatement
  //     | MaximizeStatement
  //     | ShowSigStatement
  //     | ShowStatement
  //     | EdgeStatement
  //     | HeuristicStatement
  //     | ProjectStatement
  //     | LuaCodeStatement
  //     | DefineStatement
  //     | PythonCodeStatement
  //     | IncludeStatement
  //     | BlockStatement
  //     | ExternalStatement
  //     | TheoryStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, STATEMENT, "<statement>");
    r = HeadStatement(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = DisjointStatement(b, l + 1);
    if (!r) r = WIfStatement(b, l + 1);
    if (!r) r = MinimizeStatement(b, l + 1);
    if (!r) r = MaximizeStatement(b, l + 1);
    if (!r) r = ShowSigStatement(b, l + 1);
    if (!r) r = ShowStatement(b, l + 1);
    if (!r) r = EdgeStatement(b, l + 1);
    if (!r) r = HeuristicStatement(b, l + 1);
    if (!r) r = ProjectStatement(b, l + 1);
    if (!r) r = LuaCodeStatement(b, l + 1);
    if (!r) r = DefineStatement(b, l + 1);
    if (!r) r = PythonCodeStatement(b, l + 1);
    if (!r) r = IncludeStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    if (!r) r = ExternalStatement(b, l + 1);
    if (!r) r = TheoryStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NTermVec |
  public static boolean TermVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TermVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM_VEC, "<term vec>");
    r = NTermVec(b, l + 1);
    if (!r) r = consumeToken(b, TERMVEC_1_0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "todo theory statement"
  public static boolean TheoryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TheoryStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THEORY_STATEMENT, "<theory statement>");
    r = consumeToken(b, "todo theory statement");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CmpOp? Term
  public static boolean Upper_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Upper_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UPPER_, "<upper>");
    r = Upper__0(b, l + 1);
    r = r && Term(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CmpOp?
  private static boolean Upper__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Upper__0")) return false;
    CmpOp(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WIF Body_ DOT LBRACK OptimizeWeight OptimizeTuple? RBRACK
  public static boolean WIfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WIfStatement")) return false;
    if (!nextTokenIs(b, WIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, W_IF_STATEMENT, null);
    r = consumeToken(b, WIF);
    p = r; // pin = 1
    r = r && report_error_(b, Body_(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, DOT, LBRACK)) && r;
    r = p && report_error_(b, OptimizeWeight(b, l + 1)) && r;
    r = p && report_error_(b, WIfStatement_5(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OptimizeTuple?
  private static boolean WIfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WIfStatement_5")) return false;
    OptimizeTuple(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // XOR
  static boolean XorOp(PsiBuilder b, int l) {
    return consumeToken(b, XOR);
  }

  /* ********************************************************** */
  // RootItem
  static boolean root(PsiBuilder b, int l) {
    return RootItem(b, l + 1);
  }

  /* ********************************************************** */
  // Expression root: ConstantTerm
  // Operator priority table:
  // 0: BINARY(XorConstantTerm)
  // 1: BINARY(QuestionConstantTerm)
  // 2: BINARY(AndConstantTerm)
  // 3: BINARY(AddConstantTerm)
  // 4: BINARY(MulConstantTerm)
  // 5: PREFIX(UnNegConstantTerm)
  // 6: PREFIX(UnNotConstantTerm)
  // 7: ATOM(ParenConstantTerm)
  // 8: ATOM(IdConstantTerm)
  // 9: PREFIX(VBarConstantTerm)
  // 10: ATOM(ConstConstantTerm)
  public static boolean ConstantTerm(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "ConstantTerm")) return false;
    addVariant(b, "<constant term>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<constant term>");
    r = UnNegConstantTerm(b, l + 1);
    if (!r) r = UnNotConstantTerm(b, l + 1);
    if (!r) r = ParenConstantTerm(b, l + 1);
    if (!r) r = IdConstantTerm(b, l + 1);
    if (!r) r = VBarConstantTerm(b, l + 1);
    if (!r) r = ConstConstantTerm(b, l + 1);
    p = r;
    r = r && ConstantTerm_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean ConstantTerm_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "ConstantTerm_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && XorOp(b, l + 1)) {
        r = ConstantTerm(b, l, 0);
        exit_section_(b, l, m, XOR_CONSTANT_TERM, r, true, null);
      }
      else if (g < 1 && QuestionOp(b, l + 1)) {
        r = ConstantTerm(b, l, 1);
        exit_section_(b, l, m, QUESTION_CONSTANT_TERM, r, true, null);
      }
      else if (g < 2 && AndOp(b, l + 1)) {
        r = ConstantTerm(b, l, 2);
        exit_section_(b, l, m, AND_CONSTANT_TERM, r, true, null);
      }
      else if (g < 3 && AddOp(b, l + 1)) {
        r = ConstantTerm(b, l, 3);
        exit_section_(b, l, m, ADD_CONSTANT_TERM, r, true, null);
      }
      else if (g < 4 && MulOp(b, l + 1)) {
        r = ConstantTerm(b, l, 4);
        exit_section_(b, l, m, MUL_CONSTANT_TERM, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean UnNegConstantTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnNegConstantTerm")) return false;
    if (!nextTokenIsSmart(b, SUB)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, SUB);
    p = r;
    r = p && ConstantTerm(b, l, 5);
    exit_section_(b, l, m, UN_NEG_CONSTANT_TERM, r, p, null);
    return r || p;
  }

  public static boolean UnNotConstantTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnNotConstantTerm")) return false;
    if (!nextTokenIsSmart(b, NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, NOT);
    p = r;
    r = p && ConstantTerm(b, l, 6);
    exit_section_(b, l, m, UN_NOT_CONSTANT_TERM, r, p, null);
    return r || p;
  }

  // LPAREN ConstantTermVec? COMMA? RPAREN
  public static boolean ParenConstantTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenConstantTerm")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LPAREN);
    r = r && ParenConstantTerm_1(b, l + 1);
    r = r && ParenConstantTerm_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PAREN_CONSTANT_TERM, r);
    return r;
  }

  // ConstantTermVec?
  private static boolean ParenConstantTerm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenConstantTerm_1")) return false;
    ConstantTermVec(b, l + 1);
    return true;
  }

  // COMMA?
  private static boolean ParenConstantTerm_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenConstantTerm_2")) return false;
    consumeTokenSmart(b, COMMA);
    return true;
  }

  // AT? Identifier LPAREN ConstantTermVec? RPAREN
  public static boolean IdConstantTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdConstantTerm")) return false;
    if (!nextTokenIsSmart(b, AT, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_CONSTANT_TERM, "<id constant term>");
    r = IdConstantTerm_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && IdConstantTerm_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AT?
  private static boolean IdConstantTerm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdConstantTerm_0")) return false;
    consumeTokenSmart(b, AT);
    return true;
  }

  // ConstantTermVec?
  private static boolean IdConstantTerm_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdConstantTerm_3")) return false;
    ConstantTermVec(b, l + 1);
    return true;
  }

  public static boolean VBarConstantTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VBarConstantTerm")) return false;
    if (!nextTokenIsSmart(b, VBAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, VBAR);
    p = r;
    r = p && ConstantTerm(b, l, 9);
    r = p && report_error_(b, consumeToken(b, VBAR)) && r;
    exit_section_(b, l, m, V_BAR_CONSTANT_TERM, r, p, null);
    return r || p;
  }

  // Identifier | Constant
  public static boolean ConstConstantTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstConstantTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_CONSTANT_TERM, "<const constant term>");
    r = Identifier(b, l + 1);
    if (!r) r = Constant(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Term
  // Operator priority table:
  // 0: BINARY(DotsTerm)
  // 1: BINARY(XorTerm)
  // 2: BINARY(QuestionTerm)
  // 3: BINARY(AndTerm)
  // 4: BINARY(AddTerm)
  // 5: BINARY(MulTerm)
  // 6: PREFIX(UnNegTerm)
  // 7: PREFIX(UnNotTerm)
  // 8: ATOM(ParenTerm)
  // 9: ATOM(IdTerm)
  // 10: PREFIX(VBarTerm)
  // 11: ATOM(ConstTerm)
  public static boolean Term(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Term")) return false;
    addVariant(b, "<term>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<term>");
    r = UnNegTerm(b, l + 1);
    if (!r) r = UnNotTerm(b, l + 1);
    if (!r) r = ParenTerm(b, l + 1);
    if (!r) r = IdTerm(b, l + 1);
    if (!r) r = VBarTerm(b, l + 1);
    if (!r) r = ConstTerm(b, l + 1);
    p = r;
    r = r && Term_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Term_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Term_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && DotsOp(b, l + 1)) {
        r = Term(b, l, 0);
        exit_section_(b, l, m, DOTS_TERM, r, true, null);
      }
      else if (g < 1 && XorOp(b, l + 1)) {
        r = Term(b, l, 1);
        exit_section_(b, l, m, XOR_TERM, r, true, null);
      }
      else if (g < 2 && QuestionOp(b, l + 1)) {
        r = Term(b, l, 2);
        exit_section_(b, l, m, QUESTION_TERM, r, true, null);
      }
      else if (g < 3 && AndOp(b, l + 1)) {
        r = Term(b, l, 3);
        exit_section_(b, l, m, AND_TERM, r, true, null);
      }
      else if (g < 4 && AddOp(b, l + 1)) {
        r = Term(b, l, 4);
        exit_section_(b, l, m, ADD_TERM, r, true, null);
      }
      else if (g < 5 && MulOp(b, l + 1)) {
        r = Term(b, l, 5);
        exit_section_(b, l, m, MUL_TERM, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean UnNegTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnNegTerm")) return false;
    if (!nextTokenIsSmart(b, SUB)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, SUB);
    p = r;
    r = p && Term(b, l, 6);
    exit_section_(b, l, m, UN_NEG_TERM, r, p, null);
    return r || p;
  }

  public static boolean UnNotTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnNotTerm")) return false;
    if (!nextTokenIsSmart(b, NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, NOT);
    p = r;
    r = p && Term(b, l, 7);
    exit_section_(b, l, m, UN_NOT_TERM, r, p, null);
    return r || p;
  }

  // LPAREN TermVec? COMMA? RPAREN
  public static boolean ParenTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenTerm")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LPAREN);
    r = r && ParenTerm_1(b, l + 1);
    r = r && ParenTerm_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PAREN_TERM, r);
    return r;
  }

  // TermVec?
  private static boolean ParenTerm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenTerm_1")) return false;
    TermVec(b, l + 1);
    return true;
  }

  // COMMA?
  private static boolean ParenTerm_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenTerm_2")) return false;
    consumeTokenSmart(b, COMMA);
    return true;
  }

  // AT? Identifier LPAREN ArgVec RPAREN
  public static boolean IdTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdTerm")) return false;
    if (!nextTokenIsSmart(b, AT, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_TERM, "<id term>");
    r = IdTerm_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && ArgVec(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AT?
  private static boolean IdTerm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdTerm_0")) return false;
    consumeTokenSmart(b, AT);
    return true;
  }

  public static boolean VBarTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VBarTerm")) return false;
    if (!nextTokenIsSmart(b, VBAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, VBAR);
    p = r;
    r = p && Term(b, l, 10);
    r = p && report_error_(b, consumeToken(b, VBAR)) && r;
    exit_section_(b, l, m, V_BAR_TERM, r, p, null);
    return r || p;
  }

  // Identifier | Constant | variable | anonymous
  public static boolean ConstTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_TERM, "<const term>");
    r = Identifier(b, l + 1);
    if (!r) r = Constant(b, l + 1);
    if (!r) r = consumeTokenSmart(b, VARIABLE);
    if (!r) r = consumeTokenSmart(b, ANONYMOUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}