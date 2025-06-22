package com.iaugusto.nearby.ui.components.welcome

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iaugusto.nearby.R
import com.iaugusto.nearby.ui.theme.Gray500
import com.iaugusto.nearby.ui.theme.RedBase
import com.iaugusto.nearby.ui.theme.Typography

@Composable
fun WelcomeHowItWorksTips(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    @DrawableRes iconRes: Int
) {
    Row(modifier = modifier, horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Icon(
            modifier = Modifier.size(32.dp),
            painter = painterResource(id = iconRes),
            tint = RedBase,
            contentDescription = "Ícone Como Funciona"
        )
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(text = title, style = Typography.headlineSmall)
            Text(text = subtitle, color = Gray500, style = Typography.bodyLarge)
        }
    }
}

@Preview
@Composable
private fun WelcomeHowItWorksTipsPreview() {
    WelcomeHowItWorksTips(
        modifier = Modifier.fillMaxWidth(),
        title = "Ative o cupom com QR Code",
        subtitle = "Escaneie o código no estabelecimento para usar o benefício",
        iconRes = R.drawable.ic_qrcode
    )
}