package com.hathway.mycomposecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.asif_bridge)
            val contentDescription = "Let this world see how valuable you are, Asif"
            val title = "Let this world see how valuable you are, Asif"
            Box(modifier = Modifier.fillMaxWidth(0.5f).padding(10.dp)) {
                ImageCardView(
                    painter = painter,
                    contentDescriptor = contentDescription,
                    title = title
                )
            }

        }
    }
}
