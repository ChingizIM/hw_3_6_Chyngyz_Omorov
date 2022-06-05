package com.example.hw_6_chyngyz_omorov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment() {
    private val data = arrayListOf<Lesson>()
    private var recView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        recView = view.findViewById(R.id.recycler_view)
        var adapter = LessonAdapter(data = data)
        recView?.adapter = adapter
        recView?.layoutManager = GridLayoutManager(requireContext(), 2)

    }

    private fun loadData() {
        data.add(
            Lesson(
                R.color.white,
                R.color.purple_500,
                "physic",
                "https://thumbs.dreamstime.com/b/%D0%BA%D0%BE%D0%BC%D0%BF-%D0%B5%D0%BA%D1%82-stydying-%D1%8D-%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D0%BE%D0%B2-%D1%82%D0%B5%D0%BC%D0%B0-physic-68750288.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.white,
                R.color.teal_700,
                "math",
                "https://image.shutterstock.com/image-vector/math-horizontal-banner-presentation-website-260nw-1859813464.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.white,
                R.color.red,
                "pe",
                "https://www.pisd.edu/cms/lib/TX02215173/Centricity/Domain/2806/PE.png"
            )
        )
        data.add(
            Lesson(
                R.color.white,
                R.color.purple_200,
                "kotlin",
                "https://cms-assets.tutsplus.com/uploads/users/1499/posts/29590/preview_image/kotlin.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.white,
                android.R.color.holo_green_light,
                "history",
                "https://image.shutterstock.com/image-vector/history-hand-drawn-historical-doodle-260nw-1782612611.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.white,
                android.R.color.secondary_text_dark_nodisable,
                "android",
                "https://lh3.googleusercontent.com/GTmuiIZrppouc6hhdWiocybtRx1Tpbl52eYw4l-nAqHtHd4BpSMEqe-vGv7ZFiaHhG_l4v2m5Fdhapxw9aFLf28ErztHEv5WYIz5fA"
            )
        )
        data.add(
            Lesson(
                R.color.black,
                android.R.color.secondary_text_light,
                "apple",
                "https://www.ixbt.com/img/r30/00/02/51/18/apple-march-presentation-2022-big.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.white,
                android.R.color.holo_orange_dark,
                "windows",
                "https://blogs.windows.com/wp-content/uploads/prod/2020/08/windows-logo-social.png"
            )
        )

    }
}