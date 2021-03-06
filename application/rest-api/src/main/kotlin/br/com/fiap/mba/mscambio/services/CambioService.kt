package br.com.fiap.mba.mscambio.services

import br.com.fiap.mba.corda.states.PropostaState
import br.com.fiap.mba.mscambio.dtos.EnvioPropostaDTO
import net.corda.core.contracts.StateAndRef
import net.corda.core.contracts.UniqueIdentifier
import java.util.UUID

interface CambioService {

    fun alterarStatusTransicao()

    fun enviarPropostaNegociacao(
        propostaNegociacao: EnvioPropostaDTO
    ): UniqueIdentifier

    fun recuperarPropostaNegociacao(
        uuid: UUID?
    ): StateAndRef<PropostaState>

    fun recuperarTransicoesDisponiveis()
}
