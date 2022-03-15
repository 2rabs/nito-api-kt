package me.r09i.nito.kernel.model

@JvmInline
value class Nickname(val value: String) {
    companion object {
        val EMPTY = Nickname(value = "")
    }
}