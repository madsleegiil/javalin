/*
 * Javalin - https://javalin.io
 * Copyright 2017 David Åse
 * Licensed under Apache 2.0: https://github.com/tipsy/javalin/blob/master/LICENSE
 */

package io.javalin.core.validation

open class BodyValidator<T>(value: T?) : Validator<T>(value, "UNUSED") {
    fun check(fieldName: String, predicate: (T) -> Boolean, errorProvider: () -> String) =
        addRule(fieldName, { predicate(it!!) }, errorProvider) as BodyValidator<T>
}
