package ru.kode.base.internship.auth.domain.di

import retrofit2.Retrofit
import ru.kode.base.internship.auth.domain.network.AuthApi
import javax.inject.Inject
import javax.inject.Provider

internal class AuthApiProvider @Inject constructor(
  private val retrofit: Retrofit,
) : Provider<AuthApi> {
  override fun get(): AuthApi {
    return retrofit.create(AuthApi::class.java)
  }
}
