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

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import pl.mpsk2.aspplugin.psi.constantTerm.*;
import pl.mpsk2.aspplugin.psi.statement.*;
import pl.mpsk2.aspplugin.psi.term.*;
import pl.mpsk2.aspplugin.psi.theory.*;

public class ASPVisitor extends PsiElementVisitor {

    public void visitAddConstantTerm(@NotNull ASPAddConstantTerm o) {
        visitBinaryConstantTerm(o);
    }

    public void visitAddTerm(@NotNull ASPAddTerm o) {
        visitBinaryTerm(o);
    }

    public void visitAddTermCsp(@NotNull ASPAddTermCsp o) {
        visitPsiElement(o);
    }

    public void visitAggregateFunction(@NotNull ASPAggregateFunction o) {
        visitPsiElement(o);
    }

    public void visitAltBodyAggrElem(@NotNull ASPAltBodyAggrElem o) {
        visitPsiElement(o);
    }

    public void visitAltBodyAggrVec(@NotNull ASPAltBodyAggrVec o) {
        visitPsiElement(o);
    }

    public void visitAltHeadAggrElem(@NotNull ASPAltHeadAggrElem o) {
        visitPsiElement(o);
    }

    public void visitAltHeadAggrVec(@NotNull ASPAltHeadAggrVec o) {
        visitPsiElement(o);
    }

    public void visitAndConstantTerm(@NotNull ASPAndConstantTerm o) {
        visitBinaryConstantTerm(o);
    }

    public void visitAndTerm(@NotNull ASPAndTerm o) {
        visitBinaryTerm(o);
    }

    public void visitArgVec(@NotNull ASPArgVec o) {
        visitPsiElement(o);
    }

    public void visitAtom(@NotNull ASPAtom o) {
        visitPsiElement(o);
    }

    public void visitBinaryArgVec(@NotNull ASPBinaryArgVec o) {
        visitPsiElement(o);
    }

    public void visitBinaryArgVecElem(@NotNull ASPBinaryArgVecElem o) {
        visitPsiElement(o);
    }

    public void visitBinaryConstantTerm(@NotNull ASPBinaryConstantTerm o) {
        visitConstantTerm(o);
    }

    public void visitBinaryTerm(@NotNull ASPBinaryTerm o) {
        visitTerm(o);
    }

    public void visitBlockStatement(@NotNull ASPBlockStatement o) {
        visitStatement(o);
    }

    public void visitBodyAggregate(@NotNull ASPBodyAggregate o) {
        visitPsiElement(o);
    }

    public void visitBodyCondDot(@NotNull ASPBodyCondDot o) {
        visitPsiElement(o);
    }

    public void visitBodyDotElem(@NotNull ASPBodyDotElem o) {
        visitPsiElement(o);
    }

    public void visitBodyDotElem2(@NotNull ASPBodyDotElem2 o) {
        visitPsiElement(o);
    }

    public void visitBody_(@NotNull ASPBody_ o) {
        visitPsiElement(o);
    }

    public void visitConjunction(@NotNull ASPConjunction o) {
        visitPsiElement(o);
    }

    public void visitConstConstantTerm(@NotNull ASPConstConstantTerm o) {
        visitConstantTerm(o);
    }

    public void visitConstTerm(@NotNull ASPConstTerm o) {
        visitTerm(o);
    }

    public void visitConstant(@NotNull ASPConstant o) {
        visitPsiElement(o);
    }

    public void visitConstantTerm(@NotNull ASPConstantTerm o) {
        visitPsiElement(o);
    }

    public void visitConstantTermVec(@NotNull ASPConstantTermVec o) {
        visitPsiElement(o);
    }

    public void visitCspLiteral(@NotNull ASPCspLiteral o) {
        visitPsiElement(o);
    }

    public void visitDefine(@NotNull ASPDefine o) {
        visitPsiElement(o);
    }

    public void visitDefineStatement(@NotNull ASPDefineStatement o) {
        visitStatement(o);
    }

    public void visitDisjointStatement(@NotNull ASPDisjointStatement o) {
        visitStatement(o);
    }

    public void visitDisjoint_(@NotNull ASPDisjoint_ o) {
        visitPsiElement(o);
    }

    public void visitDisjunction(@NotNull ASPDisjunction o) {
        visitPsiElement(o);
    }

    public void visitDisjunctionSep(@NotNull ASPDisjunctionSep o) {
        visitPsiElement(o);
    }

    public void visitDotsTerm(@NotNull ASPDotsTerm o) {
        visitTerm(o);
    }

    public void visitEdgeStatement(@NotNull ASPEdgeStatement o) {
        visitStatement(o);
    }

    public void visitExternalStatement(@NotNull ASPExternalStatement o) {
        visitStatement(o);
    }

    public void visitHeadAggrElem(@NotNull ASPHeadAggrElem o) {
        visitPsiElement(o);
    }

    public void visitHeadAggrVec(@NotNull ASPHeadAggrVec o) {
        visitPsiElement(o);
    }

    public void visitHeadAggregate(@NotNull ASPHeadAggregate o) {
        visitPsiElement(o);
    }

    public void visitHeadStatement(@NotNull ASPHeadStatement o) {
        visitStatement(o);
    }

    public void visitHead_(@NotNull ASPHead_ o) {
        visitPsiElement(o);
    }

    public void visitHeuristicStatement(@NotNull ASPHeuristicStatement o) {
        visitStatement(o);
    }

    public void visitIdConstantTerm(@NotNull ASPIdConstantTerm o) {
        visitConstantTerm(o);
    }

    public void visitIdTerm(@NotNull ASPIdTerm o) {
        visitTerm(o);
    }

    public void visitIdentifier(@NotNull ASPIdentifier o) {
        visitPsiElement(o);
    }

    public void visitIdentifierList(@NotNull ASPIdentifierList o) {
        visitPsiElement(o);
    }

    public void visitIfStatement(@NotNull ASPIfStatement o) {
        visitStatement(o);
    }

    public void visitIncludeStatement(@NotNull ASPIncludeStatement o) {
        visitStatement(o);
    }

    public void visitLNOptCondition(@NotNull ASPLNOptCondition o) {
        visitPsiElement(o);
    }

    public void visitLiteral(@NotNull ASPLiteral o) {
        visitPsiElement(o);
    }

    public void visitLuBodyAggregate(@NotNull ASPLuBodyAggregate o) {
        visitPsiElement(o);
    }

    public void visitLuHeadAggregate(@NotNull ASPLuHeadAggregate o) {
        visitPsiElement(o);
    }

    public void visitLuaCodeStatement(@NotNull ASPLuaCodeStatement o) {
        visitStatement(o);
    }

    public void visitMaxMinElem(@NotNull ASPMaxMinElem o) {
        visitPsiElement(o);
    }

    public void visitMaxMinList(@NotNull ASPMaxMinList o) {
        visitPsiElement(o);
    }

    public void visitMaximizeStatement(@NotNull ASPMaximizeStatement o) {
        visitStatement(o);
    }

    public void visitMinimizeStatement(@NotNull ASPMinimizeStatement o) {
        visitStatement(o);
    }

    public void visitMulConstantTerm(@NotNull ASPMulConstantTerm o) {
        visitBinaryConstantTerm(o);
    }

    public void visitMulTerm(@NotNull ASPMulTerm o) {
        visitBinaryTerm(o);
    }

    public void visitMulTermCsp(@NotNull ASPMulTermCsp o) {
        visitPsiElement(o);
    }

    public void visitNCspElem(@NotNull ASPNCspElem o) {
        visitPsiElement(o);
    }

    public void visitNCspVec(@NotNull ASPNCspVec o) {
        visitPsiElement(o);
    }

    public void visitNLitVec(@NotNull ASPNLitVec o) {
        visitPsiElement(o);
    }

    public void visitNOptCondition(@NotNull ASPNOptCondition o) {
        visitPsiElement(o);
    }

    public void visitNTermVec(@NotNull ASPNTermVec o) {
        visitPsiElement(o);
    }

    public void visitOptCondition(@NotNull ASPOptCondition o) {
        visitPsiElement(o);
    }

    public void visitOptimizeCond(@NotNull ASPOptimizeCond o) {
        visitPsiElement(o);
    }

    public void visitOptimizeLitVec(@NotNull ASPOptimizeLitVec o) {
        visitPsiElement(o);
    }

    public void visitOptimizeTuple(@NotNull ASPOptimizeTuple o) {
        visitPsiElement(o);
    }

    public void visitOptimizeWeight(@NotNull ASPOptimizeWeight o) {
        visitPsiElement(o);
    }

    public void visitParenConstantTerm(@NotNull ASPParenConstantTerm o) {
        visitConstantTerm(o);
    }

    public void visitParenTerm(@NotNull ASPParenTerm o) {
        visitTerm(o);
    }

    public void visitProgram(@NotNull ASPProgram o) {
        visitPsiElement(o);
    }

    public void visitProjectStatement(@NotNull ASPProjectStatement o) {
        visitStatement(o);
    }

    public void visitProjectStatementBody(@NotNull ASPProjectStatementBody o) {
        visitPsiElement(o);
    }

    public void visitPythonCodeStatement(@NotNull ASPPythonCodeStatement o) {
        visitStatement(o);
    }

    public void visitQuestionConstantTerm(@NotNull ASPQuestionConstantTerm o) {
        visitBinaryConstantTerm(o);
    }

    public void visitQuestionTerm(@NotNull ASPQuestionTerm o) {
        visitBinaryTerm(o);
    }

    public void visitShowSigStatement(@NotNull ASPShowSigStatement o) {
        visitStatement(o);
    }

    public void visitShowStatement(@NotNull ASPShowStatement o) {
        visitStatement(o);
    }

    public void visitShowStatementBody(@NotNull ASPShowStatementBody o) {
        visitPsiElement(o);
    }

    public void visitStatement(@NotNull ASPStatement o) {
        visitPsiElement(o);
    }

    public void visitTerm(@NotNull ASPTerm o) {
        visitPsiElement(o);
    }

    public void visitTermVec(@NotNull ASPTermVec o) {
        visitPsiElement(o);
    }

    public void visitTheoryAtomDefinition(@NotNull ASPTheoryAtomDefinition o) {
        visitPsiElement(o);
    }

    public void visitTheoryAtomType(@NotNull ASPTheoryAtomType o) {
        visitPsiElement(o);
    }

    public void visitTheoryDefinitionIdentifier(@NotNull ASPTheoryDefinitionIdentifier o) {
        visitPsiElement(o);
    }

    public void visitTheoryDefinitionVec(@NotNull ASPTheoryDefinitionVec o) {
        visitPsiElement(o);
    }

    public void visitTheoryOperatorDefinition(@NotNull ASPTheoryOperatorDefinition o) {
        visitPsiElement(o);
    }

    public void visitTheoryOperatorDefinitionList(@NotNull ASPTheoryOperatorDefinitionList o) {
        visitPsiElement(o);
    }

    public void visitTheoryOperatorList(@NotNull ASPTheoryOperatorList o) {
        visitPsiElement(o);
    }

    public void visitTheoryRoot(@NotNull ASPTheoryRoot o) {
        visitPsiElement(o);
    }

    public void visitTheoryStatement(@NotNull ASPTheoryStatement o) {
        visitStatement(o);
    }

    public void visitTheoryTermDefinition(@NotNull ASPTheoryTermDefinition o) {
        visitPsiElement(o);
    }

    public void visitUnNegConstantTerm(@NotNull ASPUnNegConstantTerm o) {
        visitConstantTerm(o);
    }

    public void visitUnNegTerm(@NotNull ASPUnNegTerm o) {
        visitTerm(o);
    }

    public void visitUnNotConstantTerm(@NotNull ASPUnNotConstantTerm o) {
        visitConstantTerm(o);
    }

    public void visitUnNotTerm(@NotNull ASPUnNotTerm o) {
        visitTerm(o);
    }

    public void visitUpper_(@NotNull ASPUpper_ o) {
        visitPsiElement(o);
    }

    public void visitVBarConstantTerm(@NotNull ASPVBarConstantTerm o) {
        visitConstantTerm(o);
    }

    public void visitVBarTerm(@NotNull ASPVBarTerm o) {
        visitTerm(o);
    }

    public void visitWIfStatement(@NotNull ASPWIfStatement o) {
        visitStatement(o);
    }

    public void visitXorConstantTerm(@NotNull ASPXorConstantTerm o) {
        visitBinaryConstantTerm(o);
    }

    public void visitXorTerm(@NotNull ASPXorTerm o) {
        visitBinaryTerm(o);
    }

    public void visitPsiElement(@NotNull PsiElement o) {
        visitElement(o);
    }

}
