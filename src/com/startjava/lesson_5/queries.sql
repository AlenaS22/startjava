-- выведите всю таблицу
SELECT * FROM Jaegers;
-- отобразите только неуничтоженных роботов
SELECT * FROM Jaegers WHERE status != 'destroyed';
-- отобразите роботов нескольких серий, например, Mark-1 и Mark-6 
SELECT * FROM Jaegers WHERE mark in (1, 6);
-- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM Jaegers ORDER BY mark DESC;
-- отобразите самого старого робота
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
-- отобразите роботов, которые уничтожили больше всех kaiju
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
-- отобразите роботов, которые уничтожили меньше всех kaiju
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);
-- отобразите средний вес роботов
SELECT AVG(weight) FROM Jaegers;
-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status != 'destroyed';
-- удалите уничтоженных роботов
DELETE FROM Jaegers WHERE status = 'destroyed';