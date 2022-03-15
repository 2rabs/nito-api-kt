package me.r09i.nito.kernel.model

@JvmInline
value class MemberId(val value: Long) {
    init {
        validate(target = value)
    }

    companion object {
        private const val EMPTY_VALUE: Long = 0
        val EMPTY = MemberId(value = EMPTY_VALUE)

        fun validate(target: Long): Boolean {
            return target >= EMPTY_VALUE
        }
    }
}