package com.example.materi

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class FragmentDetailMateriArgs(
  public val idMateri: Int,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("idMateri", this.idMateri)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("idMateri", this.idMateri)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FragmentDetailMateriArgs {
      bundle.setClassLoader(FragmentDetailMateriArgs::class.java.classLoader)
      val __idMateri : Int
      if (bundle.containsKey("idMateri")) {
        __idMateri = bundle.getInt("idMateri")
      } else {
        throw IllegalArgumentException("Required argument \"idMateri\" is missing and does not have an android:defaultValue")
      }
      return FragmentDetailMateriArgs(__idMateri)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): FragmentDetailMateriArgs {
      val __idMateri : Int?
      if (savedStateHandle.contains("idMateri")) {
        __idMateri = savedStateHandle["idMateri"]
        if (__idMateri == null) {
          throw IllegalArgumentException("Argument \"idMateri\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"idMateri\" is missing and does not have an android:defaultValue")
      }
      return FragmentDetailMateriArgs(__idMateri)
    }
  }
}
