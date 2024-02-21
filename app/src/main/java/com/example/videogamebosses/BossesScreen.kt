package com.example.videogamebosses

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.videogamebosses.model.Boss


@Composable
fun BossItem(
    boss: Boss,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (expanded) MaterialTheme.colorScheme.secondaryContainer
        else MaterialTheme.colorScheme.primaryContainer,
    )
    Card(
        modifier = Modifier,
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioHighBouncy,
                        stiffness = Spring.StiffnessMediumLow
                    )
                )
                .background(color = color)
        ) {
            Row(
                modifier = Modifier
            ) {
                Text(
                    modifier = modifier
                        .padding(
                            start = dimensionResource(id = R.dimen.dimens_8),
                            top = dimensionResource(id = R.dimen.dimens_8)
                        ),
                    text = stringResource(boss.nameRes),
                    style = MaterialTheme.typography.displayMedium,
                )
                Spacer(modifier = Modifier.weight(1f))
                BossItemButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded }
                )
            }

            BossPhoto(
                bossPhoto = boss.ImageRes,
                modifier = modifier.padding(8.dp)
            )
            if (expanded) {
                BossInformationIfExpanded(
                    boss.DescRes,
                    modifier = Modifier
                )
            }
        }
    }
}

@Composable
fun BossPhoto(
    @DrawableRes bossPhoto: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .fillMaxWidth(),
        painter = painterResource(bossPhoto),
        contentDescription = null,
    )
}

@Composable
fun BossInformationIfExpanded(
    @StringRes bossInfo: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            modifier = modifier
                .padding(
                    start = dimensionResource(id = R.dimen.dimens_8),
                    top = dimensionResource(
                        id = R.dimen.dimens_8
                    )
                ),
            text = stringResource(id = R.string.boss_type),
            style = MaterialTheme.typography.labelLarge
        )
        Text(
            modifier = modifier
                .padding(
                    start = dimensionResource(id = R.dimen.dimens_8),
                    top = dimensionResource(id = R.dimen.dimens_8),
                    bottom = dimensionResource(id = R.dimen.dimens_8)
                ),
            text = stringResource(bossInfo),
        )
    }
}

@Composable
private fun BossItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = stringResource(R.string.expand_button_content_description),
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun BossList(bosses: List<Boss>, contentPadding: PaddingValues) {
    LazyColumn(
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.dimens_8)),
        modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.dimens_16))
    ) {
        items(bosses) { boss ->
            BossItem(boss = boss)
        }
    }
}