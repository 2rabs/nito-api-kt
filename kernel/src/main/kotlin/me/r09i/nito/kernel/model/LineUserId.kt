package me.r09i.nito.kernel.model

@JvmInline
value class LineUserId(val value: String) {
    companion object {
        val EMPTY = LineUserId(value = "")
    }
}