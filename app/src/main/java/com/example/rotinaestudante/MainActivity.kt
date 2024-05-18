package com.example.rotinaestudante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rotinaestudante.ui.theme.RotinaEstudanteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RotinaEstudanteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RotinaEstudante()
                }
            }
        }
    }
}

@Composable
fun RotinaEstudante() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.programming_and_exercise),
            contentDescription = "Imagem da Rotina",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Minha Rotina Diária",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(16.dp))
        TarefaItem(horario = "06:00", descricao = "Acordo e tomo café da manhã")
        TarefaItem(horario = "07:00", descricao = "Vou para a academia")
        TarefaItem(horario = "08:00", descricao = "Volto para casa e tomo banho")
        TarefaItem(horario = "09:00", descricao = "Assisto às aulas de programação online")
        TarefaItem(horario = "12:00", descricao = "Almoço")
        TarefaItem(horario = "13:00", descricao = "Estudo independente e pratico codificação")
        TarefaItem(horario = "17:00", descricao = "Faço um lanche e descanso")
        TarefaItem(horario = "18:00", descricao = "Trabalho em projetos pessoais de programação")
        TarefaItem(horario = "20:00", descricao = "Janto")
        TarefaItem(horario = "21:00", descricao = "Relaxo e leio sobre novas tecnologias")
        TarefaItem(horario = "22:30", descricao = "Vou dormir")
    }
}

@Composable
fun TarefaItem(horario: String, descricao: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Text(text = horario, style = MaterialTheme.typography.bodyLarge)
        Text(text = descricao, style = MaterialTheme.typography.bodyMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RotinaEstudanteTheme {
        RotinaEstudante()
    }
}