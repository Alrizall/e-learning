package com.example.materi

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

public class FragmentMateriDirections private constructor() {
  private data class ActionFragmentMateri2ToFragmentDetailMateri2(
    public val idMateri: Int,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_fragmentMateri2_to_fragmentDetailMateri2

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("idMateri", this.idMateri)
        return result
      }
  }

  public companion object {
    public fun actionFragmentMateri2ToFragmentDetailMateri2(idMateri: Int): NavDirections =
        ActionFragmentMateri2ToFragmentDetailMateri2(idMateri)
  }
}
