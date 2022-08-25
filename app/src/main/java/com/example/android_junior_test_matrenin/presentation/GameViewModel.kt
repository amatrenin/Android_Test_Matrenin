package com.example.android_junior_test_matrenin.presentation

import androidx.lifecycle.ViewModel
import com.example.android_junior_test_matrenin.domain.usecase.BestScoreUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(private val bestScoreUseCase: BestScoreUseCase) :
    ViewModel() {

    fun setBestScore(value: Int) {
        if (value > bestScoreUseCase.getBestScore())
            bestScoreUseCase.setBestScore(value)
    }
}