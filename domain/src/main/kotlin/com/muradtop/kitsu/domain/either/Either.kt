package com.muradtop.kitsu.domain.either

sealed class Either<out A, out B> {
    class Left<out A>(val value: A) : com.muradtop.kitsu.domain.either.Either<A, Nothing>()
    class Right<out B>(val value: B) : com.muradtop.kitsu.domain.either.Either<Nothing, B>()
}
