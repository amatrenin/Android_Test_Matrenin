package com.example.android_junior_test_matrenin.di.module

import com.example.android_junior_test_matrenin.domain.repository.ScoreRepository
import com.example.android_junior_test_matrenin.domain.usecase.BestScoreUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DomaineModul {

    companion object {

        @Provides
        fun provideBestScoreUseCase(scoreRepository: ScoreRepository): BestScoreUseCase =
            BestScoreUseCase(scoreRepository = scoreRepository)
    }
}
