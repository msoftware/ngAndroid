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

package com.ngandroid.lib.ng.getters;

import com.ngandroid.lib.utils.TypeUtils;

/**
 * Created by davityle on 1/24/15.
 */
public class StaticGetter<T> implements Getter<T>{
    private final T object;
    private final int type;

    public StaticGetter(T object, int type) {
        if(type == TypeUtils.STRING){
            String value = (String) object;
            this.object = (T) value.substring(1, value.length() - 1);
        }else
            this.object = object;
        this.type = type;
    }

    @Override
    public T get() throws Throwable {
        return object;
    }

    public int getType(){
        return type;
    }

    @Override
    public String toString() {
        return String.valueOf(object);
    }
}
