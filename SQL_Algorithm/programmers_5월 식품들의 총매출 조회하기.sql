SELECT B.PRODUCT_ID, A.PRODUCT_NAME, SUM(A.PRICE * B.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT A, FOOD_ORDER B
WHERE A.PRODUCT_ID = B.PRODUCT_ID
AND B.PRODUCE_DATE BETWEEN TO_DATE('2022-05-01', 'YYYY-MM-DD') AND TO_DATE('2022-05-31', 'YYYY-MM-DD')
GROUP BY B.PRODUCT_ID, A.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, B.PRODUCT_ID ASC
;