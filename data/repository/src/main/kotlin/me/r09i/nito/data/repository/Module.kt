package me.r09i.nito.data.repository

import me.r09i.nito.data.repository.internal.MemberDataRepository
import me.r09i.nito.kernel.repository.MemberRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<MemberRepository> {
        MemberDataRepository()
    }
}