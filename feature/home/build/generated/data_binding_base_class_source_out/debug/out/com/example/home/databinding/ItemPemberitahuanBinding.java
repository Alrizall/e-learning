// Generated by view binder compiler. Do not edit!
package com.example.home.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.home.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPemberitahuanBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView tvInformation;

  @NonNull
  public final ImageView uvUx1;

  private ItemPemberitahuanBinding(@NonNull CardView rootView, @NonNull TextView tvInformation,
      @NonNull ImageView uvUx1) {
    this.rootView = rootView;
    this.tvInformation = tvInformation;
    this.uvUx1 = uvUx1;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPemberitahuanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPemberitahuanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_pemberitahuan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPemberitahuanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_Information;
      TextView tvInformation = ViewBindings.findChildViewById(rootView, id);
      if (tvInformation == null) {
        break missingId;
      }

      id = R.id.uv_ux1;
      ImageView uvUx1 = ViewBindings.findChildViewById(rootView, id);
      if (uvUx1 == null) {
        break missingId;
      }

      return new ItemPemberitahuanBinding((CardView) rootView, tvInformation, uvUx1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
