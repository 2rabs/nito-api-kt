package me.r09i.nito.kernel.repository

import me.r09i.nito.kernel.model.Member
import me.r09i.nito.kernel.model.MemberId

interface MemberRepository {
    suspend fun getMember(id: MemberId): Member
}