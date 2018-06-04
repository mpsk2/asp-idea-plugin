/*
 * Copyright 2018-2018 Michał Piotr Stankiewicz
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

package pl.mpsk2.aspplugin.options;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@State(
        name = "ASPApplicationSettings",
        storages = {
                @Storage(file = "$APP_CONFIG/other.xml")
        }
)
public class ASPApplicationSettings implements PersistentStateComponent<ASPApplicationSettings> {
    private String clasp;
    private String clingo;
    private String gringo;

    @NotNull
    @Override
    public ASPApplicationSettings getState() {
        return this;
    }

    @Override
    public void loadState(ASPApplicationSettings state) {
        XmlSerializerUtil.copyBean(state, this);
    }

    public static ASPApplicationSettings getInstance() {
        return ServiceManager.getService(ASPApplicationSettings.class);
    }

    public String getClasp() {
        return clasp;
    }

    public void setClasp(String clasp) {
        this.clasp = clasp;
    }

    public String getClingo() {
        return clingo;
    }

    public void setClingo(String clingo) {
        this.clingo = clingo;
    }

    public String getGringo() {
        return gringo;
    }

    public void setGringo(String gringo) {
        this.gringo = gringo;
    }
}
