SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A,
     ANIMAL_OUTS B
WHERE A.ANIMAL_ID = B.ANIMAL_ID
  AND B.DATETIME < A.DATETIME
ORDER BY A.DATETIME ASC