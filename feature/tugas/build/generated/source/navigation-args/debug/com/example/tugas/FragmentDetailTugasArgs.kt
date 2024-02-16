package com.example.tugas

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class FragmentDetailTugasArgs(
  public val idTugas: Int,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("idTugas", this.idTugas)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("idTugas", this.idTugas)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FragmentDetailTugasArgs {
      bundle.setClassLoader(FragmentDetailTugasArgs::class.java.classLoader)
      val __idTugas : Int
      if (bundle.containsKey("idTugas")) {
        __idTugas = bundle.getInt("idTugas")
      } else {
        throw IllegalArgumentException("Required argument \"idTugas\" is missing and does not have an android:defaultValue")
      }
      return FragmentDetailTugasArgs(__idTugas)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): FragmentDetailTugasArgs {
      val __idTugas : Int?
      if (savedStateHandle.contains("idTugas")) {
        __idTugas = savedStateHandle["idTugas"]
        if (__idTugas == null) {
          throw IllegalArgumentException("Argument \"idTugas\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"idTugas\" is missing and does not have an android:defaultValue")
      }
      return FragmentDetailTugasArgs(__idTugas)
    }
  }
}
