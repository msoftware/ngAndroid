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

import com.ngandroid.lib.ng.getters.Getter;

/**
 * Created by tyler on 2/10/15.
 */
public class NgInvisible extends NgIf {
    private static NgInvisible ngInvisible = new NgInvisible();
    private NgInvisible(){}

    public static NgInvisible getInstance() {
        return ngInvisible;
    }

    @Override
    protected FireCheckObserver getModelMethod(Getter<Boolean> getter, View view) {
        return new FireCheckObserver(getter, view, false);
    }
}
