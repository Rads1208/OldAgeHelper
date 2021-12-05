package com.radhika.oldagehelper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.radhika.oldagehelper.adapters.ServicesAdapter
import com.radhika.oldagehelper.databinding.FragmentServicesBinding
import com.radhika.oldagehelper.models.ServiceModel

class ServicesFragment : Fragment() {
    private lateinit var _binding: FragmentServicesBinding
    private val binding get() = _binding

    private val serviceAdapter: ServicesAdapter by lazy { ServicesAdapter() }
    val img1 = "https://images.unsplash.com/photo-1624462966475-15d78c57d20e"
    val img2 = "https://images.unsplash.com/photo-1624541149858-9e1eb43747e0"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentServicesBinding.inflate(inflater, container, false)

        binding.serviceRecycle.layoutManager = LinearLayoutManager(requireContext())
        binding.serviceRecycle.adapter = serviceAdapter

        val v1 = ServiceModel(1, "Radhika", "Cleaning", img1)
        val v2 = ServiceModel(1, "Aahna", "Dish Wash", img2)
        val v3 = ServiceModel(1, "Radhika", "Jharu", img1)
        val v4 = ServiceModel(1, "Aahna", "Pocha", img2)
        val v5 = ServiceModel(1, "Radhika", "Bartan", img1)
        val v6 = ServiceModel(1, "Aahna", "JKASDJKASHD", img2)

        serviceAdapter.setData(listOf(v1, v2, v3, v4, v5, v6))

        return binding.root
    }


}