// Generated by view binder compiler. Do not edit!
package com.softsquared.template.kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.softsquared.template.kotlin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDongneBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnDongne;

  @NonNull
  public final Button btnDongneCategory;

  @NonNull
  public final Button btnDongneProfile;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageButton imageButton3;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final RecyclerView recyclerView;

  private FragmentDongneBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnDongne,
      @NonNull Button btnDongneCategory, @NonNull Button btnDongneProfile,
      @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2,
      @NonNull ImageButton imageButton3, @NonNull LinearLayout linearLayout2,
      @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.btnDongne = btnDongne;
    this.btnDongneCategory = btnDongneCategory;
    this.btnDongneProfile = btnDongneProfile;
    this.imageButton = imageButton;
    this.imageButton2 = imageButton2;
    this.imageButton3 = imageButton3;
    this.linearLayout2 = linearLayout2;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDongneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDongneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dongne, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDongneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_dongne;
      Button btnDongne = ViewBindings.findChildViewById(rootView, id);
      if (btnDongne == null) {
        break missingId;
      }

      id = R.id.btn_dongne_category;
      Button btnDongneCategory = ViewBindings.findChildViewById(rootView, id);
      if (btnDongneCategory == null) {
        break missingId;
      }

      id = R.id.btn_dongne_profile;
      Button btnDongneProfile = ViewBindings.findChildViewById(rootView, id);
      if (btnDongneProfile == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.imageButton2;
      ImageButton imageButton2 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton2 == null) {
        break missingId;
      }

      id = R.id.imageButton3;
      ImageButton imageButton3 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton3 == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new FragmentDongneBinding((ConstraintLayout) rootView, btnDongne, btnDongneCategory,
          btnDongneProfile, imageButton, imageButton2, imageButton3, linearLayout2, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}