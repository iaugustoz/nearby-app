package com.iaugusto.nearby.ui.components.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iaugusto.nearby.R
import com.iaugusto.nearby.ui.theme.Typography

@Composable
fun WelcomeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(24.dp)) {
        Text(text = "Veja como funciona:", style = Typography.bodyLarge)

        WelcomeHowItWorksTips(
            modifier = Modifier.fillMaxWidth(),
            title = "Encontre estabelecimentos",
            subtitle = "Veja locais perto de você que são parceiros Nearby",
            iconRes = R.drawable.ic_map_pin
        )
        WelcomeHowItWorksTips(
            modifier = Modifier.fillMaxWidth(),
            title = "Ative o cupom com QR Code",
            subtitle = "Escaneie o código no estabelecimento para usar o benefício",
            iconRes = R.drawable.ic_qrcode
        )
        WelcomeHowItWorksTips(
            modifier = Modifier.fillMaxWidth(),
            title = "Garanta vantagens perto de você",
            subtitle = "Ative cupons onde estiver, em diferentes tipos de estabelecimentos",
            iconRes = R.drawable.ic_ticket
        )
    }
}

@Preview
@Composable
private fun WelcomeContentPreview() {
    WelcomeContent()
}