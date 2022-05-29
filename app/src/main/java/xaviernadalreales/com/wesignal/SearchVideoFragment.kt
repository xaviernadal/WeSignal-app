package xaviernadalreales.com.wesignal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SearchVideoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.video_search_fragment_layout, container, false)

        //view.findViewById<Button>(R.id.gallery_open).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_emptyFragment) }
        return view
    }
}