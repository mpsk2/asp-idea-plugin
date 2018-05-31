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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ASPInterpreter {
    private boolean isDefault;
    @Nullable
    private String name;
    @Nullable
    private String path;
    @Nullable
    private String version;

    public ASPInterpreter() { }
    public ASPInterpreter(ASPInterpreter e) {
        this.isDefault = e.isDefault;
        this.name = e.name;
        this.path = e.path;
        this.version = e.version;
    }

    @NotNull
    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getPath() {
        return path;
    }

    @Nullable
    public String getVersion() {
        return version;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
