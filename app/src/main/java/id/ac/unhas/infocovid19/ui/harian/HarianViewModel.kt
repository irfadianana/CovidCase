package id.ac.unhas.infocovid19.ui.harian

import androidx.lifecycle.ViewModel
import id.ac.unhas.infocovid19.model.Harian

class HarianViewModel(
    private val repository: HarianRepository
) : ViewModel() {
    private var _movies = ArrayList<Harian>()
    val movies:ArrayList<Harian>
        get() = _movies

    fun getMoviesFromRepo(){
        //_movies.clear()
        _movies.apply {
            if(isEmpty()){
                addAll(repository.getMoviesFromJsonString())
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        _movies.clear()
    }
}