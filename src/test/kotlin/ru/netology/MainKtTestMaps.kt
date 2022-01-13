package ru.netology

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTestMaps {

    @Test
    fun payAdditional_shouldReturn0ForVkPay() {
        //arrange
        val cardType = "Vk Pay"
        val amount = 20000
        val transferBefore = 0

        //act
        val result = payAdditional(
            amount = amount,
            cardType = cardType,
            transferBefore = transferBefore
        )
        //assert
        assertEquals(11110, result)

    }
    @Test
    fun payAdditional_shouldReturn70000ForVkPay() {
        //arrange
        val cardType = "Vk Pay"
        val amount = 70000
        val transferBefore = 0

        //act
        val result = payAdditional(
            amount = amount,
            cardType = cardType,
            transferBefore = transferBefore
        )
        //assert
        assertEquals(0, result)

    }

    @Test
    fun payAdditional_shouldReturn0_75PercentsForVisaAndMir() {
        //arrange
        val cardType1 = "Visa"
        val cardType2 = "Мир"
        val amount = 1000000
        val transferBefore = 999250

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore
        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(7500, result1)
        assertEquals(7500, result2)
    }

    @Test
    fun payAdditional_cardIsMasterCardOrVisa_shouldReturnZeroForTotalTransferBetween3000And75000() {
        //arrange
        val cardType1 = "MasterCard"
        val cardType2 = "Maestro"
        val amount = 10000
        val transferBefore = 7940

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(2060, result1)
        assertEquals(2060, result2)
    }


    @Test
    fun payAdditional_cardIsMasterCardOrVisa_shouldReturn0_6PercentPlus2000FromAmountForTotalTransferLessThan30000() {
        //arrange
        val cardType1 = "MasterCard"
        val cardType2 = "Maestro"
        val amount = 100000
        val transferBefore = 0

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(0, result1)
        assertEquals(0, result2)
    }

    @Test
    fun payAdditional_cardIsMasterCardOrVisa_shouldReturn0_6PercentPlus2000FromAmountForTotalTransferMoreThan7500000() {
        //arrange
        val cardType1 = "MasterCard"
        val cardType2 = "Maestro"
        val amount = 7500000
        val transferBefore = 1

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(47000, result1)
        assertEquals(47000, result2)
    }
    @Test
    fun payAdditional_cardIsMasterCardOrVisa_shouldReturn0_6PercentPlus20001FromAmountForTotalTransferMoreThan7500000() {
        //arrange
        val cardType1 = "MasterCard"
        val cardType2 = "Maestro"
        val amount = 8000000
        val transferBefore = 1

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(50000, result1)
        assertEquals(50000, result2)
    }
    @Test
    fun payAdditional_cardIsMasterCardOrVisa_shouldReturn0_6PercentPlus250FromAmountForTotalTransferMoreThan7500000() {
        //arrange
        val cardType1 = "MasterCard"
        val cardType2 = "Maestro"
        val amount = 10000
        val transferBefore = 1

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(2060, result1)
        assertEquals(2060, result2)
    }

}