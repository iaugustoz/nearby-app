package com.iaugusto.nearby.ui.components.market

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iaugusto.nearby.data.model.Market
import com.iaugusto.nearby.data.model.mock.mockMarkets
import com.iaugusto.nearby.ui.theme.Typography

@Composable
fun NearbyMarketCardList(
    modifier: Modifier = Modifier,
    markets: List<Market>,
    onMarketClick: (Market) -> Unit
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(text = "Explore locais perto de você", style = Typography.bodyLarge)
        }
        items(items = markets, key = { it.id }) { market ->
            NearbyMarketCard(
                market = market,
                onClick = { onMarketClick(market) }
            )
        }
    }
}

@Preview
@Composable
private fun NearbyMarketCardListPrev() {
    NearbyMarketCardList(
        modifier = Modifier.fillMaxWidth(1f),
        markets = mockMarkets,
        onMarketClick = {}
    )
}