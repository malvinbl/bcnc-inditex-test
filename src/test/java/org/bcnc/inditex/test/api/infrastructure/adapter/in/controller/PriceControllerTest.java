package org.bcnc.inditex.test.api.infrastructure.adapter.in.controller;

import org.bcnc.inditex.test.api.AbstractIntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class PriceControllerTest extends AbstractIntegrationTest {

    private static final String URL = "/prices/details";

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    void test_1() throws Exception {
        mockMvc.perform(
                get(URL).contentType("application/json")
                    .param("date", "2020-06-14T10:00:00")
                    .param("productId", "35455")
                    .param("brandId", "1")
            )
            .andExpect(status().is(HttpStatus.OK.value()))
            .andExpect(jsonPath("$.productId", is(35455)))
            .andExpect(jsonPath("$.brandId", is(1)))
            .andExpect(jsonPath("$.priceList", is(1)))
            .andExpect(jsonPath("$.date", is("2020-06-14T10:00:00")))
            .andExpect(jsonPath("$.price", is(35.50)))
            .andReturn().getResponse().getContentAsString();
    }

    @Test
    void test_2() throws Exception {
        mockMvc.perform(
                get(URL).contentType("application/json")
                    .param("date", "2020-06-14T16:00:00")
                    .param("productId", "35455")
                    .param("brandId", "1")
            )
            .andExpect(status().is(HttpStatus.OK.value()))
            .andExpect(jsonPath("$.productId", is(35455)))
            .andExpect(jsonPath("$.brandId", is(1)))
            .andExpect(jsonPath("$.priceList", is(2)))
            .andExpect(jsonPath("$.date", is("2020-06-14T16:00:00")))
            .andExpect(jsonPath("$.price", is(25.45)))
            .andReturn().getResponse().getContentAsString();
    }

    @Test
    void test_3() throws Exception {
        mockMvc.perform(
                get(URL).contentType("application/json")
                    .param("date", "2020-06-14T21:00:00")
                    .param("productId", "35455")
                    .param("brandId", "1")
            )
            .andExpect(status().is(HttpStatus.OK.value()))
            .andExpect(jsonPath("$.productId", is(35455)))
            .andExpect(jsonPath("$.brandId", is(1)))
            .andExpect(jsonPath("$.priceList", is(1)))
            .andExpect(jsonPath("$.date", is("2020-06-14T21:00:00")))
            .andExpect(jsonPath("$.price", is(35.50)))
            .andReturn().getResponse().getContentAsString();
    }

    @Test
    void test_4() throws Exception {
        mockMvc.perform(
                get(URL).contentType("application/json")
                    .param("date", "2020-06-15T10:00:00")
                    .param("productId", "35455")
                    .param("brandId", "1")
            )
            .andExpect(status().is(HttpStatus.OK.value()))
            .andExpect(jsonPath("$.productId", is(35455)))
            .andExpect(jsonPath("$.brandId", is(1)))
            .andExpect(jsonPath("$.priceList", is(3)))
            .andExpect(jsonPath("$.date", is("2020-06-15T10:00:00")))
            .andExpect(jsonPath("$.price", is(30.50)))
            .andReturn().getResponse().getContentAsString();
    }

    @Test
    void test_5() throws Exception {
        mockMvc.perform(
                get(URL).contentType("application/json")
                    .param("date", "2020-06-16T21:00:00")
                    .param("productId", "35455")
                    .param("brandId", "1")
            )
            .andExpect(status().is(HttpStatus.OK.value()))
            .andExpect(jsonPath("$.productId", is(35455)))
            .andExpect(jsonPath("$.brandId", is(1)))
            .andExpect(jsonPath("$.priceList", is(4)))
            .andExpect(jsonPath("$.date", is("2020-06-16T21:00:00")))
            .andExpect(jsonPath("$.price", is(38.95)))
            .andReturn().getResponse().getContentAsString();
    }

}