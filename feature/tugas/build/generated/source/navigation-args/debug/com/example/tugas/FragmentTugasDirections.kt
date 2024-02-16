package com.example.tugas

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

public class FragmentTugasDirections private constructor() {
  private data class ActionFragmentTugas2ToFragmentDetailTugas2(
    public val idTugas: Int,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_fragmentTugas2_to_fragmentDetailTugas2

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("idTugas", this.idTugas)
        return result
      }
  }

  public companion object {
    public fun actionFragmentTugas2ToFragmentDetailTugas2(idTugas: Int): NavDirections =
        ActionFragmentTugas2ToFragmentDetailTugas2(idTugas)
  }
}
