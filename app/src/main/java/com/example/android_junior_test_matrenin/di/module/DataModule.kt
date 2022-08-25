package com.example.android_junior_test_matrenin.di.module

import android.content.Context
import com.example.android_junior_test_matrenin.data.repository.ScoreRepositoryImpl
import com.example.android_junior_test_matrenin.domain.repository.ScoreRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun provideScoreRepository(@ApplicationContext context: Context): ScoreRepository {
        return ScoreRepositoryImpl(context = context)
    }
}