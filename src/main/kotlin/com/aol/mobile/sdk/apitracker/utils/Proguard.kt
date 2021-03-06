/*
 * Copyright 2018, Oath Inc.
 * Licensed under the terms of the MIT License. See LICENSE.md file in project root for terms.
 */

package com.aol.mobile.sdk.apitracker.utils

import com.aol.mobile.sdk.apitracker.dto.TypeDescriptor

object Proguard {
    fun generateRules(typeDescriptors: List<TypeDescriptor>) = typeDescriptors
            .joinToString(separator = "\n\n", postfix = "\n") { type ->
                """|-keep public class ${type.name} {
                   |    public protected *;
                   |}""".trimMargin()
            }
}
