package me.r09i.nito.kernel.model

data class Member(
    val id: MemberId,
    val lineUserId: LineUserId,
    val nickname: Nickname,
) {
    companion object {
        val EMPTY = Member(
            id = MemberId.EMPTY,
            lineUserId = LineUserId.EMPTY,
            nickname = Nickname.EMPTY,
        )
    }
}
