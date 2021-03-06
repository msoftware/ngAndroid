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

package com.ngandroid.lib.ngattributes.ngchange;

import android.text.Editable;
import android.text.TextWatcher;

import com.ngandroid.lib.ng.getters.MethodGetter;

/**
* Created by tyler on 1/29/15.
*/
class TextChangedWatcher implements TextWatcher {
    private final MethodGetter invoker;

    public TextChangedWatcher(MethodGetter invoker) {
        this.invoker = invoker;
    }

    @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

    @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}

    @Override
    public void afterTextChanged(Editable s) {
        invoker.get();
    }
}
