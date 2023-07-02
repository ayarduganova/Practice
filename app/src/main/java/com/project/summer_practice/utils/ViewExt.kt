package com.project.summer_practice.utils

import android.view.View
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import java.time.Duration

fun View.showSnackbar(
    id: Int,
    @BaseTransientBottomBar.Duration duration: Int = Snackbar.LENGTH_LONG
) = Snackbar.make(this, id, duration).show()