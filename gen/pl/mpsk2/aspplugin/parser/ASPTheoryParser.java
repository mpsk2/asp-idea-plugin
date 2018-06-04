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
import static pl.mpsk2.aspplugin.parser.ASPParser.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ASPTheoryParser {

    /* ********************************************************** */
    // "todo1"
    public static boolean TheoryAtomDefinition(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryAtomDefinition")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, THEORY_ATOM_DEFINITION, "<theory atom definition>");
        r = consumeToken(b, "todo1");
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // LEFT
    //     | RIGHT
    //     | UNARY
    //     | BINARY
    //     | HEAD
    //     | BODY
    //     | ANY
    //     | DIRECTIVE
    //     | Identifier
    public static boolean TheoryDefinitionIdentifier(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryDefinitionIdentifier")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, THEORY_DEFINITION_IDENTIFIER, "<theory definition identifier>");
        r = consumeToken(b, LEFT);
        if (!r) r = consumeToken(b, RIGHT);
        if (!r) r = consumeToken(b, UNARY);
        if (!r) r = consumeToken(b, BINARY);
        if (!r) r = consumeToken(b, HEAD);
        if (!r) r = consumeToken(b, BODY);
        if (!r) r = consumeToken(b, ANY);
        if (!r) r = consumeToken(b, DIRECTIVE);
        if (!r) r = Identifier(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // TheoryTermDefinition (SEM TheoryTermDefinition)*
    //     | TheoryAtomDefinition (SEM TheoryAtomDefinition)*
    public static boolean TheoryDefinitionVec(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryDefinitionVec")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, THEORY_DEFINITION_VEC, "<theory definition vec>");
        r = TheoryDefinitionVec_0(b, l + 1);
        if (!r) r = TheoryDefinitionVec_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // TheoryTermDefinition (SEM TheoryTermDefinition)*
    private static boolean TheoryDefinitionVec_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryDefinitionVec_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = TheoryTermDefinition(b, l + 1);
        r = r && TheoryDefinitionVec_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (SEM TheoryTermDefinition)*
    private static boolean TheoryDefinitionVec_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryDefinitionVec_0_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!TheoryDefinitionVec_0_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "TheoryDefinitionVec_0_1", c)) break;
        }
        return true;
    }

    // SEM TheoryTermDefinition
    private static boolean TheoryDefinitionVec_0_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryDefinitionVec_0_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, SEM);
        r = r && TheoryTermDefinition(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // TheoryAtomDefinition (SEM TheoryAtomDefinition)*
    private static boolean TheoryDefinitionVec_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryDefinitionVec_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = TheoryAtomDefinition(b, l + 1);
        r = r && TheoryDefinitionVec_1_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (SEM TheoryAtomDefinition)*
    private static boolean TheoryDefinitionVec_1_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryDefinitionVec_1_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!TheoryDefinitionVec_1_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "TheoryDefinitionVec_1_1", c)) break;
        }
        return true;
    }

    // SEM TheoryAtomDefinition
    private static boolean TheoryDefinitionVec_1_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryDefinitionVec_1_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, SEM);
        r = r && TheoryAtomDefinition(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // theoryop COLON number COMMA (UNARY|BINARY COMMA (LEFT|RIGHT))
    public static boolean TheoryOperatorDefinition(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryOperatorDefinition")) return false;
        if (!nextTokenIs(b, THEORYOP)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, THEORYOP, COLON, NUMBER, COMMA);
        r = r && TheoryOperatorDefinition_4(b, l + 1);
        exit_section_(b, m, THEORY_OPERATOR_DEFINITION, r);
        return r;
    }

    // UNARY|BINARY COMMA (LEFT|RIGHT)
    private static boolean TheoryOperatorDefinition_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryOperatorDefinition_4")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, UNARY);
        if (!r) r = TheoryOperatorDefinition_4_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // BINARY COMMA (LEFT|RIGHT)
    private static boolean TheoryOperatorDefinition_4_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryOperatorDefinition_4_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, BINARY, COMMA);
        r = r && TheoryOperatorDefinition_4_1_2(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // LEFT|RIGHT
    private static boolean TheoryOperatorDefinition_4_1_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryOperatorDefinition_4_1_2")) return false;
        boolean r;
        r = consumeToken(b, LEFT);
        if (!r) r = consumeToken(b, RIGHT);
        return r;
    }

    /* ********************************************************** */
    // TheoryOperatorDefinition (SEM TheoryOperatorDefinition)*
    public static boolean TheoryOperatorDefinitionList(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryOperatorDefinitionList")) return false;
        if (!nextTokenIs(b, THEORYOP)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = TheoryOperatorDefinition(b, l + 1);
        r = r && TheoryOperatorDefinitionList_1(b, l + 1);
        exit_section_(b, m, THEORY_OPERATOR_DEFINITION_LIST, r);
        return r;
    }

    // (SEM TheoryOperatorDefinition)*
    private static boolean TheoryOperatorDefinitionList_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryOperatorDefinitionList_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!TheoryOperatorDefinitionList_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "TheoryOperatorDefinitionList_1", c)) break;
        }
        return true;
    }

    // SEM TheoryOperatorDefinition
    private static boolean TheoryOperatorDefinitionList_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryOperatorDefinitionList_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, SEM);
        r = r && TheoryOperatorDefinition(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // TheoryDefinitionVec?
    public static boolean TheoryRoot(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryRoot")) return false;
        Marker m = enter_section_(b, l, _NONE_, THEORY_ROOT, "<theory root>");
        TheoryDefinitionVec(b, l + 1);
        exit_section_(b, l, m, true, false, null);
        return true;
    }

    /* ********************************************************** */
    // TheoryDefinitionIdentifier LBRACE TheoryOperatorDefinitionList? RBRACE
    public static boolean TheoryTermDefinition(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryTermDefinition")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, THEORY_TERM_DEFINITION, "<theory term definition>");
        r = TheoryDefinitionIdentifier(b, l + 1);
        r = r && consumeToken(b, LBRACE);
        r = r && TheoryTermDefinition_2(b, l + 1);
        r = r && consumeToken(b, RBRACE);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // TheoryOperatorDefinitionList?
    private static boolean TheoryTermDefinition_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TheoryTermDefinition_2")) return false;
        TheoryOperatorDefinitionList(b, l + 1);
        return true;
    }

}
