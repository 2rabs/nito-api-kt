package me.r09i.nito.data.repository.internal

import me.r09i.nito.kernel.model.Member
import me.r09i.nito.kernel.model.MemberId
import me.r09i.nito.kernel.repository.MemberRepository

internal class MemberDataRepository : MemberRepository {
    override suspend fun getMember(id: MemberId): Member {
        return Member.EMPTY
    }
}