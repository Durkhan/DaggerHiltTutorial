package com.depencyinjection.daggerhilt

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainNModule {

    @ActivityScoped
    @Provides
    @Named("String2")
    fun providesString2(
        @ApplicationContext context: Context,
        @Named("String1") teststring1:String
    )="${context.getString(R.string.hilt_injectt)}"
}