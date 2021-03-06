/*
 * Copyright 2015 Tyler Davis
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.ngandroid.lib.ngattributes.ngif;

import android.view.View;

import com.ngandroid.lib.ng.ModelMethod;
import com.ngandroid.lib.ng.getters.Getter;

/**
 * Created by tyler on 2/10/15.
 */
public class NgDisabled extends NgIf {
    private static NgDisabled ngDisabled = new NgDisabled();
    private NgDisabled(){}

    public static NgDisabled getInstance(){
        return ngDisabled;
    }

    @Override
    protected ModelMethod getModelMethod(final Getter<Boolean> getter, final View view) {
        return new ModelMethod() {
            @Override
            public Object invoke(String fieldName, Object... args) {
                try {
                    if(getter.get()){
                        view.setEnabled(false);
                    }else{
                        view.setEnabled(true);
                    }
                } catch (Throwable throwable) {
                    // TODO - error
                    throwable.printStackTrace();
                }
                return null;
            }
        };
    }
}
