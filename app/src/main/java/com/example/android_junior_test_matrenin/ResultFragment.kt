package com.example.android_junior_test_matrenin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android_junior_test_matrenin.app.App
import com.example.android_junior_test_matrenin.databinding.ResultFragmentBinding
import com.example.android_junior_test_matrenin.presentation.ResultViewModel
import com.example.android_junior_test_matrenin.ui.GameFragment
import com.example.android_junior_test_matrenin.ui.StartFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultFragment : Fragment() {

    private val viewModel by viewModels<ResultViewModel>()

    private lateinit var binding: ResultFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        (requireActivity().applicationContext as App)
        binding = ResultFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val score = getScore() ?: return

        binding.scoreNumber.text = score.toString()

        binding.bestScoreNumber.text = viewModel.getBestScore().toString()

        binding.menuButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, StartFragment())
                .commit()
        }

        binding.playAgainButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, GameFragment())
                .addToBackStack("GameFragment")
                .commit()
        }
    }

    private fun getScore(): Int? =
        arguments?.getInt(SCORE)

    companion object {
        fun newInstance(score: Int): ResultFragment =
            ResultFragment().apply {
                arguments = bundleOf(SCORE to score)
            }

        private const val SCORE = "SCORE"
    }
}