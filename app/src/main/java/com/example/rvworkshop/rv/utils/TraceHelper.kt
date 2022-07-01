package com.example.rvworkshop.rv.utils

import androidx.core.os.TraceCompat

object TraceHelper {

    inline fun trace(sectionName: String, trace: () -> Unit) {
        if(!TraceCompat.isEnabled()) {
            trace.invoke()
            return
        }

        TraceCompat.beginSection(sectionName)
        trace.invoke()
        TraceCompat.endSection()
    }

}